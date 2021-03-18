package quiz04;

public abstract class Fighter {

	//field
	private String name;
	private boolean isAlive;	//energe가 0이면 false
	private int energe;			//에너지 (1~100)
	private int power;			//공격력 (1~10)
	
	//constructor
	public Fighter(String name, int energe, int power) {	//isAlive는 에너지에 종속이라 isAlive해제하고 constructor생성
		super();
		this.name = name;
		this.energe = energe;
		this.power = power;
		this.isAlive = true;								//처음에 true로 설정해줌
	}
	
	//method
	public abstract void attack(Fighter fighter);
	
}
