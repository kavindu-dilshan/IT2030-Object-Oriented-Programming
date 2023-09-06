package exercise_02;

class Feet {
	private int feet;
	private int inches;
	
	public Feet(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}
	
	public Feet(Feet len) {
		this.feet = len.feet;
		this.inches = len.inches;
	}
	
	// Add f1+f2 feet and store in current feet
	public void add(Feet f1, Feet f2) {
		this.feet = f1.feet + f2.feet;
		this.inches = f1.inches + f2.inches;
		
		if(inches > 12) {
			this.feet = this.feet + (this.inches/12);
			this.inches = this.inches % 12;
		}
	}
	
	public void add(Feet f1) {
		this.feet = this.feet + f1.feet;
		this.inches = this.inches + f1.inches;
		
		if(inches > 12) {
			this.feet = this.feet + (inches/12);
			this.inches = this.inches % 12;
		}
	}
	
	public static Feet add(Feet f1, Feet f2, Feet f3) {
		Feet f = new Feet(0,0);
		f.add(f1, f2);
		f.add(f, f3);
		
		return f;
	}
	// Display a Length e.g 5’6”
	public void print() {
		System.out.println(feet + "'" + inches + "\"");
	}
	
	public void print(String msg) {
		System.out.println(msg + feet + "'" + inches + "\"");
	}
	
	public static void print(Feet f) {
		System.out.println(f.feet + "'" + f.inches + "\"");
	}
}
