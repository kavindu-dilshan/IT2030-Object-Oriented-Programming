package exercise_01;
import java.util.Scanner;

public class Student {
	
	int mark1;
	int mark2;
	int mark3;
	double average;
	String ID;
	String name;
	
	public Student(){
		mark1 = 0;
		mark2 = 0;
		mark3 = 0;
	}
	
	public Student(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public void calAverage() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the marks of subject 1: ");
		mark1 = sc.nextInt();
		System.out.print("Enter the marks of subject 2: ");
		mark2 = sc.nextInt();
		System.out.print("Enter the marks of subject 3: ");
		mark3 = sc.nextInt();
		
		sc.close();
		
		average = (mark1+mark2+mark3)/3.0;
	}
	
	public void display() {
		System.out.println("");
		System.out.println("ID: " + ID);
		System.out.println("Name: " + name);
		System.out.println("Average Mark: " + String.format("%.2f", average));
	}
}
