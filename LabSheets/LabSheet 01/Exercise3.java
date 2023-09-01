import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		
		int age;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		age = sc.nextInt();
		
		if(age >= 18) 
			System.out.println("Adult");
		else
			System.out.println("Child");
	}
}