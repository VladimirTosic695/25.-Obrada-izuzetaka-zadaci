package _25_Izuzeci3Artikal;

public class Artikal {
	
	String naziv, proizvodjac, barkod;
	double cena;
	
	public void setNaziv(String naziv) throws IzuzetakArtikal {
		if(naziv.isBlank())
			throw new IzuzetakArtikal("Greska. Polje naziv je prazno.");
		this.naziv = naziv;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setProizvodjac(String proizvodjac) throws IzuzetakArtikal {
		if(proizvodjac.isBlank() || proizvodjac.isEmpty())
			throw new IzuzetakArtikal("Polje proizvodjac ne sme biti prazno!");
		else
			this.proizvodjac = proizvodjac;
	}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setBarkod(String barkod) throws IzuzetakArtikal {
		if(barkod.isBlank() || barkod.isEmpty())
			throw new IzuzetakArtikal("Barkod mora postojati.");
		else
			this.barkod = barkod;
	}
	public String getBarkod() {
		return barkod;
	}
	public void setCena(double cena) throws IzuzetakArtikal {
	
		if(cena < 0)
			throw new IzuzetakArtikal("Cena mora biti veca od 0.");
		else
			this.cena = cena;
	}
	
	public String toString () {
		return "Naziv: " + naziv + "\nProizvodjac: " + proizvodjac +
				"\nBarkod: " + barkod + "\nCena: " + cena;
	}
	

}
