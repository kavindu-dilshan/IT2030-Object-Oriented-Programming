import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int length = sc.nextInt();
		
		System.out.print("Enter the width: ");
		int width = sc.nextInt();
		
		System.out.print("Enter the height: ");
		int height = sc.nextInt();
		
		int volume = length * width * height;
		
		System.out.println("Volume of the cube: " + volume);
	}
}