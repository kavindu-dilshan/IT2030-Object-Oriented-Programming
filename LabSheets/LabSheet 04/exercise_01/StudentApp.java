package exercise_01;

public class StudentApp {

	public static void main(String[] args) {
		
		Student[] std = new Student[5];
		std[0] = new Student("Kavindu", "Interactive Media", "0778645263");
		std[1] = new Student("Malindu", "Cyber Security", "0723471534");
		std[2] = new Student("Dishal", "Information Technology", "0786253861");
		std[3] = new Student("Sachith", "Software Engineering", "0752735183");
		std[4] = new Student("Sandunika", "Data Science", "0718253516");
		
		for(int i = 0; i < std.length; i++) {
			std[i].print();
			System.out.println("");
		}
	}
}
