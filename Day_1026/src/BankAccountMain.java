
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		a.accountNO = "1234";
		a.name = "홍길동";
		a.balance = 10000;
		
		a.output();
		a.deposit(5000);
		a.output();
		
		BankAccount b = new BankAccount();
		b.accountNO = "4321";
		b.name = "손오공";
		b.balance = 200000;
		
		b.output();
		b.withdraw(210000);
	}

}
