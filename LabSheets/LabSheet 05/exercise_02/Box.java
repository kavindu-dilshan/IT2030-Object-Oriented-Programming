package exercise_02;

public class Box implements ICompute {
	private int length, width, height;
	private int volume;
	
	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void calculate() {
		volume = length * width * height;
	}
	
	public void display() {
		System.out.println();
		System.out.println("Volume of the box: " + volume);
	}
}
