package exercise_08;

public class Cat extends Pet {
	
	private int livesLeft;
	
	public Cat(String n, String o) {
		super(n, o);
		this.livesLeft = 7;
	}
	
	public Cat(String n, String o, int a, int l) {
		super(n,o,a);
		this.livesLeft = l;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I am a Cat. " + this.livesLeft + " lives remain for me.");
	}
}//end of the cat class
