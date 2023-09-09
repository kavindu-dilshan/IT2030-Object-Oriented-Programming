package exercise_03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int maxSubjects;
		int [] marks = new int[5];
		int total = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		try {
		// 1. Input a value for maxSubjects
		System.out.print("Input maximum number of subjects: ");
		maxSubjects = sc.nextInt();
		
		// 2. Using a for loop
		for(int i = 0; i < maxSubjects; i++) {
			System.out.print("Enter the marks for subject " + (i+1) + ": ");
			marks[i] = sc.nextInt();
			total = total + marks[i];
		}
		
		// 3. Calculate the Ave marks
		avg = total / maxSubjects;
		System.out.println("Average marks: " + avg);
		
		// 4. Use a try catch block to prevent the following run time errors
		
		// (a) Input valid integers to the inputs
		} catch (InputMismatchException e) {
			System.out.println("Enter an integer value: " + e.getMessage());
			
		// (b) ArithmeticException division by zero
		} catch (ArithmeticException e) {
			System.out.println("Can't devide by zero: " + e.getMessage());	
			
		// (c) ArrayIndexOutOfBounds
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter maximum number of subject less than 5: " + e.getMessage());
			
		// Exception
		} catch (Exception e) {
			System.out.println("Unknown error: " + e.getMessage());
		}
		finally {
		System.out.println("This code will be gurrentied to run");
		}
		System.out.println("The end");
	}

}
