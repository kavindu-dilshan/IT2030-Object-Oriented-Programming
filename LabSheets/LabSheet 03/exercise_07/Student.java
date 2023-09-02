package exercise_07;

class Student extends Person {
	
	private String studentid;
	
	public Student(String name, String address, String studentid) {
		super(name, address);
		this.studentid = studentid;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Student ID: " + studentid);
	}
}
