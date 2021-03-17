package ex07_override;

public class GogumaPizza extends Pizza{

	//field
	private String Goguma;
	
	//constructor
	public GogumaPizza(String dough, int cheese, String goguma) {
		super(dough, cheese);
		Goguma = goguma;
	}
	
	//method
	@Override
		//고구마 정보의 출력을 위해서 Pizza의 info()를 다시 만들어야 합니다.
	public void info() {
		super.info();
		System.out.println("고구마 원산지: " + Goguma);
	}
}