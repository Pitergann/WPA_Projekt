
public class Kunde extends Termin{			//verknüpft kunde mit seinem termin um alle informationen über ihn am terim zu haben
	
	
	public String Name;					//Attribute
	public String Vorname;
	public String StrNr;
	public int PLZ;
	public String Mail;
	public String Telefon;
	public String Mob;
	
	
	public Kunde(String time, String date, int duration) { //Konstruktor
		super(time, date, duration);
		// TODO Auto-generated constructor stub
	}
	
	
	//Methoden
	public void setName(String Name) {
		Name = this.Name;
	}
	public String getName() {
		return Name;
	}
	
	
	public void setVorname(String Vorname) {
		Vorname = this.Vorname;
	}
	public String getVorname() {
		return Vorname;
	}
	
	
	public void setStrNr(String StrNr) {
		StrNr = this.StrNr;
	}
	public String getStrNr() {
		return StrNr;
	}
	
	
	public void setPLZ(int PLZ) {
		PLZ = this.PLZ;
	}
	public int getPLZ() {
		return PLZ;
	}
	
	
	public void setMail(String Mail) {
		Mail = this.Mail;
	}
	public String getMail() {
		return Mail;
	}
	
	
	public void setTelefon(String Telefon) {
		Telefon = this.Telefon;
	}
	public String getTelefon() {
		return Telefon;
	}
	
	
	public void setMob(String Mob) {
		Mob = this.Mob;
	}
	public String getMob() {
		return Mob;
	}
}
