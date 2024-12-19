package exam;

public class test3 {

	public static void main(String[] args) {
		
		Account account = new Account("123-45-6789", "홍길동", 10000);
		account.deposit(5000);
		
		account.withdraw(10000);

	}

}
