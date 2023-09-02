package exercise_08;

public class Dog extends Pet {
	
	private int noOfMasters;
	
	public Dog(String n, String o) {
		super(n,o);
		this.noOfMasters = 1;	
	}
	
	public Dog(String n, String o, int a, int m) {
		super(n,o,a);
		this.noOfMasters = m;
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.println("I am dog. I have " + this.noOfMasters + " masters at home.");
	}
}//end of the dog class
