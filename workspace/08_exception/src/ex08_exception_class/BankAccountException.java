package ex08_exception_class;

@SuppressWarnings("serial")
public class BankAccountException extends Exception {

	//field
	private int errerCode;
	
	//constructor
	public BankAccountException(String message, int errorCode) {
		super(message);	//슈퍼클래스: Exception으로 message를 전달하면 예외메세지가 만들어진다.
						//사실Exception위에 Throwable클래스가 있고 그 클래스의 detailMessage(String값)에 저장됨 몰라도됨
		this.errerCode = errorCode;
	}

	public int getErrerCode() {
		return errerCode;
	}

	public void setErrerCode(int errerCode) {
		this.errerCode = errerCode;
	}
	
}
