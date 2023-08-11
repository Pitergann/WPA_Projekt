
public class Auto extends Termin{ 			//verknüpft Auto mit seinem termin um alle informationen darüber am terim zu haben
		
	
	public String Marke;		//Attribute
	public String Modell;
	public int Baujahr;
	public String Kennzeichen;
	
	
	public Auto(String time, String date, int duration) {	//Konstruktor
		super(time, date, duration);
		// TODO Auto-generated constructor stub
	}
	
	//Methoden
	public void setMarke(String Marke) {
		Marke = this.Marke;
	}
	public String getMarke() {
		return Marke;
	}
	
	
	public void setModell(String Modell) {
		Modell = this.Modell;
	}
	public String getModell() {
		return Modell;
	}
	
	
	public void setBaujahr(int Baujahr) {
		Baujahr = this.Baujahr;
	}
	public int getBaujahr() {
		return Baujahr;
	}
	
	
	public void setName(String Kennzeichen) {
		Kennzeichen = this.Kennzeichen;
	}
	public String getKennzeichen() {
		return Kennzeichen;
	}

}
