package exercise_05;
import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String in = sc.nextLine();

        System.out.print("Enter the character to count: ");
        char target = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < in.length(); i++) {
            char currentChar = in.charAt(i);
            if (currentChar == target) {
                count++;
            }
        }
        
        System.out.println("The character '" + target + "' occurs " + count + " times in the string.");

        sc.close();
	}
}
