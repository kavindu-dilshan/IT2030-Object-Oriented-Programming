package exercise_02;

class Student {
	
	String name, ditno, address;
	
	//Default Constructor
	public Student() {
		
	}
	
	//Overloaded Constructor (Constructor with Parameters)
	public Student(String sName, String sDitNo, String sAddress) {
		name = sName;
		ditno = sDitNo;
		address = sAddress;
	}
}
