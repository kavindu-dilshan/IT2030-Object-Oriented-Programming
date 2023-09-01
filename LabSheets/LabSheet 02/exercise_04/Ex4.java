import java.io.*;

public class Ex4 {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the length: ");
		int length = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the width: ");
		int width = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the height: ");
		int height = Integer.parseInt(br.readLine());
		
		int volume = length * width * height;
		
		System.out.println("Volume of the cube: " + volume);
	}
}