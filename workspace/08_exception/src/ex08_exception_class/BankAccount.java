package ex08_exception_class;

public class BankAccount {
	
	//field
	private String accNo;	//계좌번호
	private long balance;	//잔고
	
	//constructor
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	//method
	public void deposit(long money) throws BankAccountException{
		if(money <= 0) {
			throw new BankAccountException(money + "원 입금은 불가능합니다.", 1000);
		}
			balance += money;
			System.out.println(money + "원 입금");
	}
	
	//실제로 출금된 금액을 반환하는메소드
	public long withdraw(long money) throws BankAccountException{	//long money: 요청금액
		if(money <= 0) {
			throw new BankAccountException(money + "원 출금은 불가능합니다.", 2000);
		}if(balance < money) {
			throw new BankAccountException("잔고부족으로 불가능합니다.", 2001);
		}
		balance -= money;
		System.out.println(money + "원 출금");
		return money;
	}

	public void transfer(BankAccount you , long money) throws BankAccountException{
		//throws BankAccountException를 붙임으로서
		//예외를 자기가 처리하지 않고 BankAccountException에게 넘기기 때문에 문제가 없음
		//ex07예제와 차이점이 이부분임
		you.deposit(withdraw(money));
	}

	public void inquiry() {
		System.out.println("계좌번호: " + accNo + ", 잔액: " + balance);
	}
}
