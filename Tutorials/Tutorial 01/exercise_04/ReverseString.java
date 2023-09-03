package exercise_04;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String in = sc.nextLine();
		
		String rev = "";
		
		for (int i = in.length() - 1; i >= 0; i--) {
			rev += in.charAt(i);
		}
		
		System.out.println("Reversed string: " + rev);
		
		sc.close();
	}
}
