package quiz03;

public class Song {
	
	//field
	private String title;
	private double playTime;
	
	public Song(String title, double playTime) {
		this.title = title;
		this.playTime = playTime;
	}
	
	public void info() {
		System.out.print("(" + title + ", " + playTime + ")");
	}
}
