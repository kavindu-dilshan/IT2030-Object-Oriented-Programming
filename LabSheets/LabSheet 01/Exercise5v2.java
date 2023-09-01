public class Exercise5v2 {
	public static void main(String[] args) {
		
		int rows = 5;
		int i,j,k;
		
		for (i = 0; i <= rows; i++) {
			
			for (j = 0; j <= rows-i; j++) {
				System.out.print(" ");
			}
			
			for (k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}