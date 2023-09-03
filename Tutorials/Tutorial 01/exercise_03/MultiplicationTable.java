package exercise_03;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter the range: ");
		int range = sc.nextInt();
		
		for(int i = 1; i <= range; i++) {
			int total = number * i;
			System.out.println(number + " x " + i + " = " + total);
		}
		sc.close();
	}

}
