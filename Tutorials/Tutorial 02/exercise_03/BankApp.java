package exercise_03;

public class BankApp {

	public static void main(String[] args) {
		
		BankAccount ac1 = new BankAccount(912643,"Kavindu",2500.0);
		BankAccount ac2 = new BankAccount(913467,"Sasindu",3500.0);
		
		ac1.display();
		ac2.display();
	}

}
