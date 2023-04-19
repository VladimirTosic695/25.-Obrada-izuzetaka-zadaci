package _25_IzuzeciTelefonskiRacun;

public class TelefonskiRacun {
	
	private String vlasnik, brojTelefona;
	private double dugovanje;
	
	public String getVlasnik() {
		return vlasnik;
	}
	public String getBroj() {
		return brojTelefona;
	}
	public double getDug() {
		return dugovanje;
	}
	public void setVlasnik(String vlasnik) throws IzuzetakTelefonskiRacun {
		if(vlasnik.isBlank()) {
			throw new IzuzetakTelefonskiRacun("Niste upisali ime vlasnika.");
		} else {
			this.vlasnik = vlasnik;
		}		
	}
	public void setBroj(String broj) throws IzuzetakTelefonskiRacun {
		if(broj.isBlank())
			throw new IzuzetakTelefonskiRacun("Polje broj ne moze biti prazno.");
		else
			this.brojTelefona = broj;
	}
	public void setDug(double dug) throws IzuzetakTelefonskiRacun {
		if(dug > 0)
			dugovanje = dug;
		else
			throw new IzuzetakTelefonskiRacun("Dugovanje mora postojati! ");
	}
	
	public String toString() {
		return "" + vlasnik + "\t " + brojTelefona + 
				"\t " + dugovanje;
	}

}
