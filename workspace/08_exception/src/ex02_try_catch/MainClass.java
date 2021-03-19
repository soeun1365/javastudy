package ex02_try_catch;

import java.text.NumberFormat;

/*
  	try{
  			코드작성  
  			(예외발생가능구역)
  			
  		}catch (예외처리 매개변수){
  					
  					예외처리구역
  			
  			}
 */
public class MainClass {

	public static void main(String[] args) {
		
		int a = 0;
		
		try {
			//System.out.println(2 / 0);			//예외가 발생하면 try문이 곧바로 종료됩니다.
			Integer.parseInt("1.5");
			a = 10;
		}catch (ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
			//System.out.println(a);				//0
		}catch (NumberFormatException e){
			System.out.println("예외가 발생했습니다.2");
		}
		
		try {
			//String name = null;
			//name.equals("james");
			int[] b = new int[3];
			b[10] = 10;
		}catch (Exception e){	//모든 예외클래스들의 상위클래스인 Exception
			System.out.println("예외가 발생했습니다.");
		}

	}

}
