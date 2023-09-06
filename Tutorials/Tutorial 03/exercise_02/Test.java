package exercise_02;

public class Test {

	public static void main(String[] args) {
		Feet f1 = new Feet(5, 6);
        Feet f2 = new Feet(6, 7);
        Feet f3 = new Feet(7, 8);

        f1.add(f2, f3);
        f1.print();

        f1.print("Length: ");

        Feet f4 = new Feet(f1);
        f4.print();

        Feet f5 = new Feet(8, 9);
        f1.add(f5);
        f1.print();

        Feet.print(f1);

        Feet f6 = Feet.add(f1, f2, f3);
        f6.print();
	}
	
}
