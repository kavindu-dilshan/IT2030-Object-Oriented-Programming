package exercise_08;

public class Main {
	
	public static void main(String[] args) {
		
		Pet p = new Pet("Lissie","Smith",3);
		p.showDetails();
		System.out.println("");
		
		Cat c = new Cat("Kyan","Silva",4,4);
		c.showDetails();
		System.out.println("");
		
		Pet p2 = new Pet("Tommy","Saman",5);
		p2.showDetails();
		System.out.println("");
		
		Cat c2 = new Cat("Kitty","Jhony",6,2);
		c2.showDetails();
		System.out.println("");
		
		Dog d1 = new Dog("Lucky","David",8,3);
		d1.showDetails();
		System.out.println("");
		
		Dog d2 = new Dog("Rocky","Daniel");
		d2.showDetails();
		System.out.println("");
		
		Pet p3 = c;
		p3.showDetails();
		System.out.println("");
		
		Dog d3 = new Dog("Syndy","Nimal",6,2);
		d3.showDetails();
		System.out.println("");
	}
}//end of the demo class
