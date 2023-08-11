
public class Termin{							//ale relevanten iformationen zum termin werden gespeichert
	
	public String date;
	public String time;
	public int i;
	int duration = i;
	
	
	public Termin(String time,String date, int duration) {	//konstruktor
		this.date =date;
		this.time = time;
		this.duration = duration;
	}
	
	
	public String getDate() {				//Methoden
		return date;
	}
	public void setDate (String date) {
		this.date = date;
	}
	
	public void setTime(String time) {
		time = this.time;
	}
	public String getTime() {
		return time;
	}
	public void setDuration (int duration) {
		duration = this.duration;
	}
	public int durationÖl() {
		return duration = i + 30;
	}
	public int durationTÜV() {
		return duration= i + 90;
	}
	public int durationClean() {
		return duration = i + 120;
	}
	public int durationGespr() {
		return duration = i + 60;
	}
	public int dontChoose() {
		return duration = i;
	}
	
}
