package exercise_04;

public class Test {

	public static void main(String[] args) {
		
		//create two students objects and assign values
		Student student1 = new Student("Kavindu Dilshan", "DIT/11/C1/0010", "Horana");
		Student student2 = new Student("Malindu Lakshan", "DIT/22/C1/0020", "Colombo");
		
		//display the values
		System.out.println(student1.getDetails());
		System.out.println(student2.getDetails());
	}
	
}
