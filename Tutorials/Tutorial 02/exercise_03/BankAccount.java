package exercise_03;

public class BankAccount {
	private int accountNumber;
	private String name;
	private double balance;
	
	public BankAccount(){
		this.accountNumber = 0;
		this.name = "";
		this.balance = 0.0;
	}
	
	public BankAccount(int accountNumber, String name, double balance ) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}
}
