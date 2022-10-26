public class BankAccount {

	String accountNO;
	String name;
	int balance;
	
	//예금하기
	public void deposit(int money) {
		balance = balance + money;
	}
	//출금하기
	public void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔고부족");
		}else {
			balance -= money;
		}
		
	}
	public void output() {
		System.out.println("계좌번호 : " + this.accountNO);
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + this.balance);
	}
}
