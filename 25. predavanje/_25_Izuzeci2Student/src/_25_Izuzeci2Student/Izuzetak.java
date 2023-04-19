package _25_Izuzeci2Student;

public class Izuzetak extends Exception {
	
	private int indeksStudenta;
	
	public Izuzetak() {
	}
	
	Izuzetak(int indeksStudenta, String poruka){
		super(poruka + "Greska Broj indeksa je veci od 100.");
		this.indeksStudenta = indeksStudenta;
	}
	
	public int getIndeksstudenta() {
		return indeksStudenta;
	}

}
