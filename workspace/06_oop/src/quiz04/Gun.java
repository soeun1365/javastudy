package quiz04;

public class Gun {
	
	//field
	private String model;
	private int bullet;
	private final int FULL_BULLLET=6;
	
	//Constructor
	public Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
	}
	
	//method
	public void shoot() {
		if(bullet > 0) {
			bullet--;
			System.out.println("빵야! " + bullet + "발 남았다.");
		}else {
			System.out.println("헛빵!");
		}
	}
	
	public void reload(int bullet) {
		if(this.bullet + bullet <=FULL_BULLLET) {
			this.bullet += bullet;
			System.out.println(bullet + "발이 장전되었다. 현재" + this.bullet +"발.");
		}else {
			int realBullet = FULL_BULLLET - this.bullet;
			this.bullet = FULL_BULLLET;
			System.out.println(realBullet + "발이 장전되었다. 현재" + this.bullet +"발.");
		}
	}
	
	public void info() {
		System.out.println(model + "에 " + bullet + "발 남았다.");
		
	}	
}
