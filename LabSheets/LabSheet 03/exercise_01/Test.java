package exercise_01;

public class Test {

	public static void main(String[] args) {
		
		//create two students objects
		Student student1 = new Student();
		Student student2 = new Student();
		
		//assign values to the attributes
		student1.name = "Kavindu Dilshan";
		student1.ditno = "DIT/11/C1/0010";
		student1.address = "Horana";
		
		student2.name = "Malindu Lakshan";
		student2.ditno = "DIT/22/C1/0020";
		student2.address = "Colombo";
		
		//display the values
		System.out.println("Student 1");
		System.out.println("Name: " + student1.name);
		System.out.println("DIT No: " + student1.ditno);
		System.out.println("Address: " + student1.address);
		
		System.out.println("");
		
		System.out.println("Student 2");
		System.out.println("Name: " + student2.name);
		System.out.println("DIT No: " + student2.ditno);
		System.out.println("Address: " + student2.address);
	}
	
}
