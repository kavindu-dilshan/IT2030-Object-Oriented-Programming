public class Ex1 {
	public static void main(String[] args) {
		
		int miles;
		int yards;
		double kilometers;
		
		miles = 26;
		yards = 385;
		
		kilometers = (miles * 1.609) + (yards / (1760.0 * 1.609));
		
		System.out.println("Distance in Kilometers: " + kilometers);
		
	}
}