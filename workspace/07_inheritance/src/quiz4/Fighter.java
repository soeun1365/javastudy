package quiz4;

public abstract class Fighter {

	//field
	private String name;
	private boolean isAlive;	//energe가 0이면 false
	private int energy;			//에너지 (1~100)
	private int power;			//공격력 (1~10)
	
	//constructor
	public Fighter(String name, int energy, int power) {	//isAlive는 에너지에 종속이라 isAlive해제하고 constructor생성
		super();
		this.name = name;
		this.energy = energy;
		this.power = power;
		this.isAlive = true;								//처음에 true로 설정해줌
	}
	
	//method
	public abstract void attack(Fighter fighter);	//추상메소드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
		this.energy = this.energy < 0 ? 0: this.energy;
		setAlive(this.energy > 0);
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void info() {
		System.out.println("이름: " + name + ", 에너지: " + energy + ", 공격력: " + power);
	}
	
	
}
