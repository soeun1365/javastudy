package ex08_exception_class;

public class MainClass {

	public static void main(String[] args) {


		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("9999", 10000);
		
		//입금,출금,이체
		try {
			//me.deposit(10000);
			//me.withdraw(5000);
			me.transfer(you, 1000000);
		}catch(BankAccountException e) {
			System.out.print("에러코드[" + e.getErrerCode() + "] ");
			System.out.println(e.getMessage());	
		}finally {
			me.inquiry();	//무조건 실행되는 영역
			you.inquiry();
		}	

	}

}
