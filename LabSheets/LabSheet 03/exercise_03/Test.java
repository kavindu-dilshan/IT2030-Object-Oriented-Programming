package exercise_03;

public class Test {

	public static void main(String[] args) {
		
		//create two students objects and assign values
		Student student1 = new Student("Kavindu Dilshan", "DIT/11/C1/0010", "Horana");
		Student student2 = new Student("Malindu Lakshan", "DIT/22/C1/0020", "Colombo");
		
		//display the values
		System.out.println("Student 1");
		System.out.println("Name: " + student1.getName());
		System.out.println("DIT No: " + student1.getDit());
		System.out.println("Address: " + student1.getAddress());
		
		System.out.println("");
		
		System.out.println("Student 2");
		System.out.println("Name: " + student2.getName());
		System.out.println("DIT No: " + student2.getDit());
		System.out.println("Address: " + student2.getAddress());
	}
	
}
