public class Demo {
	public static void main(String[] args) {
		
		EvenOddNumber num = new EvenOddNumber();
		
		boolean result = num.findEvenOrOdd(5);
		
		if (result == true) {
			System.out.print("This is an even number.");
		}
		else {
			System.out.print("This is an odd number.");
		}
	}
}
