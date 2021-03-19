package ex15_interface_extends;

public class MainClass {

	public static void main(String[] args) {
		
		//1. Phoen타입의 smartphone
		Phone phone1 = new SmartPhone();
		phone1.sendCall();
		((Computable)phone1).playApp();	//캐스팅으로 playApp()호출가능

		//2. Computable타입의 smartphone
		Computable phone2 = new SmartPhone();
		((Phone)phone2).sendCall();			//캐스팅으로 sendCall()호출가능
		phone2.playApp();
		
		//3. SmartPhone타입의 smartphone
		SmartPhone phone3 = new SmartPhone();
		phone3.sendCall();
		phone3.playApp();
	}

}
