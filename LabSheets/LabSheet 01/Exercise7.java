import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner no1 = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		num1 = no1.nextInt();
		
		Scanner no2 = new Scanner(System.in);
		System.out.print("Enter Number 2: ");
		num2 = no2.nextInt();
		
		int sum = num1 + num2;
		int average = (num1 + num2) / 2;
		
		System.out.println("Sum: " +sum);
		System.out.println("Average: " +average);
	}
}