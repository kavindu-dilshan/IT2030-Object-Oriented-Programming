package exercise_02;
import java.util.Scanner;

public class AverageCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Series of numbers.");
		System.out.println("Enter any negative number to terminate.");
		
		int sum = 0;
		int count = 0;
		
		while(true) {
			int number = sc.nextInt();
			
			if(number < 0) {
				break;
			}
			sum = sum + number;
			count++;
		}
		
		if(count > 0) {
			double average = (double) sum / count;
			System.out.println("Average is: " + average);
		}else {
			System.out.println("No valid inputs given.");
		}
		
		sc.close();
	}
}
