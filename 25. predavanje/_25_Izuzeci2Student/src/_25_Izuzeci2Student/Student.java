package _25_Izuzeci2Student;

public class Student {
	
	String ime, prezime, adresa;
	int brojIndeksa;
	
	Student(String ime, String prezime, String adresa, int brojIndeksa) throws Izuzetak {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		
		if(brojIndeksa >= 1 && brojIndeksa <= 99)
			this.brojIndeksa = brojIndeksa;
		else
			throw new Izuzetak(brojIndeksa, "Izuzetak tj. ");
	}
	
	public void ispisi() {
		System.out.println( "Ime: " + ime + "\nPrezime: " + prezime + "\nAdresa: " + adresa + 
				"\nBroj indeksa: " + brojIndeksa);
	}

}
