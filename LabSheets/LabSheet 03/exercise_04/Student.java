package exercise_04;

class Student {
	
	private String name, ditno, address;

	//Default Constructor
	public Student() {
		
	}
	
	//Overloaded Constructor (Constructor with Parameters)
	public Student(String sName, String sDitNo, String sAddress) {
		name = sName;
		ditno = sDitNo;
		address = sAddress;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDit() {
		return ditno;
	}

	public void setDit(String ditno) {
		this.ditno = ditno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDetails() {
		String s = "I am a Student.\r\n" + "My name is " + name + ".\n" + "I am from " + address + ".\n" + "My dit no is " + ditno + ".\n";
		return s;
	}
}
