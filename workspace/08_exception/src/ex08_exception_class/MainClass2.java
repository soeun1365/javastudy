package ex08_exception_class;

public class MainClass2 {

	public static void main(String[] args) throws BankAccountException{
		//main() 메소드가 던진 예외는 JVM이 처리합니다.
	
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("9999", 10000);
		
		me.deposit(1000);
		me.withdraw(1000);
		me.transfer(you, 5000);
		me.inquiry();
		you.inquiry();

	}

}
