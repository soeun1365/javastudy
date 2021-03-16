package quiz04;

public class Soilder {

	//field
	private String name;
	private Gun gun;
	
	//constructor
	public Soilder(String name, Gun gun) {
		this.name = name;
		this.gun = gun;
	}
	//method
	public void shoot() {
		gun.shoot();
	}
	
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	public void info() {
		System.out.print(name +", ");
		gun.info();
	}
	
	
	
	}
