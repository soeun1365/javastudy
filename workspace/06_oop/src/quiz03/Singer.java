package quiz03;

public class Singer {
	
	//field
	private String name;
	private Song song;	//대표곡이 하나, 궁극적으로 이것도 할것임private Song[] songs;

	//constructor
	public Singer(String name){
		this.name = name;
	}
	
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	
	public void info() {
		System.out.print(name);
		song.info();
	}
}
