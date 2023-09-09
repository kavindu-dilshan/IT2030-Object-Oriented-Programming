package exercise_01;

public class Main {

	public static void main(String[] args) {
		Cat mycat = new Cat("Micky");
		mycat.display();
		
		Dog mydog = new Dog("Rover");
		mydog.display();
		
		ToyCat mytoy = new ToyCat("kittie","Toysrus");
		mytoy.display();
		
		ToyCat mytoy2 = new ToyCat();
		mytoy2.display();
		
	}

}
