package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Gun gun = new Gun("K2", 2);
		Soilder soilder = new Soilder("람보", gun);
		
		soilder.shoot();	//빵야! 1발 남았다.
		soilder.shoot();	//빵야! 0발 남았다.
		soilder.shoot();	//헛빵!
		
		soilder.reload(2);	//2발이 장전되었다. 현재2발.
		soilder.reload(6);	//4발이 장전되었다. 현재6발.
		soilder.reload(6);	//0발이 장전되었다. 현재6발.

		soilder.info();	//람보, K2에 6발 남았다.
	}

}
