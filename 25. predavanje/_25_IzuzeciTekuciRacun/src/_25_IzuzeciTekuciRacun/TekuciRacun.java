package _25_IzuzeciTekuciRacun;

public class TekuciRacun {

	private String brojTekuceg, vlasnik;
	private double iznos;
	
	public String getTekuci() {
		return brojTekuceg;
	}
	
	public void setTekuci(String tekuci) {
		if(tekuci.isBlank() || tekuci.isEmpty())
			throw new IzuzetakTekuciRacun("Niste uneli broj tekuceg racuna.");
		else
			brojTekuceg = tekuci;
	}
	public String getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(String vlasnik) {
		if(vlasnik.isBlank() || vlasnik.isEmpty())
			throw new IzuzetakTekuciRacun("Niste uneli ime!");
		this.vlasnik = vlasnik;
	}
	
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		if(iznos < 25000 && iznos > 0)
			this.iznos = iznos;
		else if(iznos < 0) {
			this.iznos = iznos;
			throw new IzuzetakTekuciRacun("U minusu ste " + Math.abs(getIznos()) + " eura.");
		}
		else
			throw new IzuzetakTekuciRacun("Na racunu imate vise od 25000 eura.");
	}
	
	public String toString() {
		return "Vlasnik: " + vlasnik + "\nBroj tekuceg: " + brojTekuceg + "\nIznos: " + iznos;
	}
	
}
