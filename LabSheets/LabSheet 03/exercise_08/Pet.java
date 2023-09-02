package exercise_08;

public class Pet {
	
	private String name;
	private String owner;
	private int age;
	
	public Pet(String n, String o) {
		this.name = n;
		this.owner = o;
		this.setAge(0);
	}
	
	public Pet(String n, String o, int a) {
		this.name = n;
		this.owner = o;
		this.setAge(a);
	}
	
	public void showDetails() {
		System.out.println("I am a pet. My name is " +this.name+ ". My owner is " +this.owner+ ".");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}//end of pet class
