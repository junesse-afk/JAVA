package exam;

public class Account {
	String accountNo = "123-45-6789";
	String ownerName = "홍길동";
	int balance = 10000;
	
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + "원, 현재 잔고 : " + balance + "원");
	}
	
	public int withdraw(int amount) {
		
		
		if (balance >= amount) {
			System.out.println("현재 잔고 : " + balance + "원, 입금할 금액 : " + amount + "원");
			balance -= amount;
			System.out.println(amount + "원이 출금 되었습니다.(현재");
		} else {
			System.out.println("현재 잔고 : " + balance + "원, 출금할 금액 : " + amount + "원");
			System.out.println("잔고가 부족하여 출금할 수 없습니다");
		}
		return balance;
	}
}
