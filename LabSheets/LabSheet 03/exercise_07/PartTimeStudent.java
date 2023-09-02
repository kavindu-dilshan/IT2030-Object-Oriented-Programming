package exercise_07;

class PartTimeStudent extends Student {
	
	private int noOfHours;
	
	public PartTimeStudent(String name, String address, String studentid, int noOfHours) {
		super(name, address, studentid);
		this.noOfHours = noOfHours;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Working Hours: " + noOfHours);
	}
}
