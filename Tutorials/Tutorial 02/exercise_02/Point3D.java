package exercise_02;

public class Point3D {
	int x, y, z;
	double distance;
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double distance() {
		distance = Math.sqrt((x*x)+(y*y)+(z*z));
		return distance;
	}
}
