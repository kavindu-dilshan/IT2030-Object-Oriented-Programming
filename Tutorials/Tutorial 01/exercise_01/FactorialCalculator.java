package exercise_01;
import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		
		int fact = 1;
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		
		if(number<0) {
			System.out.println("Please enter positive number.");
		}
		else {
			for(int i=1; i<=number; i++) {
				fact = fact * i;
			}
		}
		System.out.println("Factorial of " + number + " is " + fact + ".");
		
		sc.close();
	}
}
