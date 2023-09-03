package exercise_02;
import java.util.Scanner;

public class PointApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the x coordinate of point 1: ");
		int x1 = sc.nextInt();
		System.out.print("Enter the y coordinate of point 1: ");
		int y1 = sc.nextInt();
		System.out.print("Enter the z coordinate of point 1: ");
		int z1 = sc.nextInt();
		
		System.out.println("");
		
		System.out.print("Enter the x coordinate of point 2: ");
		int x2 = sc.nextInt();
		System.out.print("Enter the y coordinate of point 2: ");
		int y2 = sc.nextInt();
		System.out.print("Enter the z coordinate of point 2: ");
		int z2 = sc.nextInt();
		
		Point3D P1 = new Point3D(x1,y1,z1);
		Point3D P2 = new Point3D(x2,y2,z2);
		
		System.out.println("");
		
		System.out.println("Distance to the origin from point 1: " + String.format("%.2f", P1.distance()));
		System.out.println("Distance to the origin from point 2: " + String.format("%.2f", P2.distance()));
		
		sc.close();
	}
}
