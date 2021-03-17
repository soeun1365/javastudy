package ex03_has_a;

public class Coord {
	private int x, y;
	public void set(int x, int y ) {
		this.x =x;
		this.y =y;
	
	}
	public void info() {
		System.out.println("[" + x + "," + y + "]");
		
	}
}
