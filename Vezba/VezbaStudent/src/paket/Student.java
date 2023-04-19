package paket;

public class Student {

	String ime, prezime, adresa;
	int brojInd;
	
	Student (String ime, String prezime, String adresa, int broj) throws Izuzetak {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		if(broj > 0 && broj < 100 )
			brojInd = broj;
		else 
			throw new Izuzetak(broj);
		
	}
	
	public void ispisi() {
		System.out.println("Ime: "+ime+"\nPrezime: "+prezime+"\nAdresa: "+adresa+"\nBroj indeksa: "+brojInd);
	}
	
	
}
