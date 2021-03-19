package ex07_exception;

//06_oop에서 quiz05의 BankAccount.java 복붙
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
	public void deposit(long money) throws DepositException{
		if(money <= 0) {
			throw new DepositException(money + "원 입금은 불가능합니다.");
		}
			balance += money;
			System.out.println(money + "원 입금");
	}
	//실제로 출금된 금액을 반환하는메소드
	
	public long withdraw(long money) throws WithdrawException  {	//long money: 요청금액
		if(money <= 0) {
			throw new WithdrawException(money + "원 출금은 불가능합니다.", 2000);
		}if(balance < money) {
			throw new WithdrawException("잔고부족으로 불가능합니다.",2001);
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
		try {
			you.deposit(withdraw(money));
		}catch(DepositException e) {
			System.out.println(e.getMessage());
		}catch(WithdrawException e){
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		}
		
	}

	public void inquiry() {
		System.out.println("계좌번호: " + accNo + ", 잔액: " + balance);
	}
}
