package quiz11;

public class Day {
	//field
	private String schedule;

	//constructor
	
	//method
		public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public void info() {
		if(schedule == null || schedule.isEmpty()) {	//null값이거나 빈 문자열("")이면
			System.out.println("[없음]");
		} else {
			System.out.println("[" + schedule + "]");
		}
	}
	
}
