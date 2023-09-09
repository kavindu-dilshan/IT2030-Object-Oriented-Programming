package exercise_02;

public class Person implements ICompute {
	private String name;
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	
	public Person(String name, double basicSal, double otRate, double otHrs) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	public double getOtRate() {
		return otRate;
	}
	public void setOtRate(double otRate) {
		this.otRate = otRate;
	}
	public double getOtHrs() {
		return otHrs;
	}
	public void setOtHrs(double otHrs) {
		this.otHrs = otHrs;
	}
	public double getNetSal() {
		return netSal;
	}
	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}

	public void calculate() {
		netSal = basicSal + (otRate * otHrs);
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Net Salary: " + netSal);
	}
}
