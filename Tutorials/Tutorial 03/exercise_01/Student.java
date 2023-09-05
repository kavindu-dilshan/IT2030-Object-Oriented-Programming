package exercise_01;

public class Student {
	int studentID;
	String name, degree, mobile;
	static int max = 100;
	
	public Student(String name, String degree, String mobile) {
		this.studentID = max++;
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println("Student ID: " + studentID);
		System.out.println("Name: " + name);
		System.out.println("Degree: " + degree);
		System.out.println("Mobile: " + mobile);
	}
	
	public int getNextStudentID() {
		return max;
	}
}
