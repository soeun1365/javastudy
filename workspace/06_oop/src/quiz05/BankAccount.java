package quiz05;

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
	public void deposit(long money) {
		if(money <= 0) {
			System.out.println(money + "원 입금은 불가능합니다.");
			return;	//return생략가능
		}
			balance += money;
			System.out.println(money + "원 입금");
	}
	//실제로 출금된 금액을 반환하는메소드
	
	public long withdraw(long money) {	//long money: 요청금액
		if(money <= 0) {
			System.out.println(money + "원 출금은 불가능합니다.");
			return 0;
		}if(balance < money) {
			System.out.println("잔고부족으로 불가능합니다.");
			return 0;
		}
		balance -= money;
		System.out.println(money + "원 출금");
		return money;
	}

	public void transfer(BankAccount you , long money) {
		//이체하면 내돈은 줄어든다.(출금)
		//withdraw(money);
		//이체하면 네돈은 늘어난다.(입금)
		//you.deposit(money);
		
		//내 통장에서 출금된 금액을 네 통장에 입금해 준다.
		you.deposit(withdraw(money));
		
	}

	public void inquiry() {
		System.out.println("계좌번호: " + accNo + ", 잔액: " + balance);
	}
}
