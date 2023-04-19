 package _25_IzuzeciCasopis;

public class Casopis {
	
	String naslov, izdavac;
	int brojCasopisa;
	double cena;
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) throws IzuzetakCasopis {
		if(naslov.isBlank())
			throw new IzuzetakCasopis("Casopis mora imati naslov! ");
		else
			this.naslov = naslov;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) throws IzuzetakCasopis {
		if (izdavac.isBlank())
			throw new IzuzetakCasopis("Casopis mora imati izdavaca! ");
		else
			this.izdavac = izdavac;
	}
	public int getBrojCasopisa() {
		return brojCasopisa;
	}
	public double getCena() {
		return cena;
	}
	public void setBrojCasopisa(int broj) throws IzuzetakCasopis {
		if(broj > 0)
			this.brojCasopisa = broj;
		else
			throw new IzuzetakCasopis("Broj casopisa mora biti pozitivan!" );
	}
	public void setCena(double cena) throws IzuzetakCasopis {
		if(cena > 0)
			this.cena = cena;
		else
			throw new IzuzetakCasopis("Cena mora biti veca od 0.");
	}
	
	public String toString () {
		return "Naslov: " + naslov + "\nIzdavac: " + izdavac +
				"\nBroj casopisa: " + brojCasopisa + "\nCena: " + cena;
	}
	
}
