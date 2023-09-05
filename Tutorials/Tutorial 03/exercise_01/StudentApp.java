package exercise_01;

public class StudentApp {

	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		
		students[0] = new Student("Kavindu", "Interactive Media", "0778645263");
		students[1] = new Student("Malindu", "Cyber Security", "0723471534");
		students[2] = new Student("Dishal", "Information Technology", "0786253861");
		students[3] = new Student("Sachith", "Software Engineering", "0752735183");
		students[4] = new Student("Sandunika", "Data Science", "0718253516");
		
		for(int i = 0; i < 5; i++) {
			students[i].print();
			System.out.println();
		}
	}

}
