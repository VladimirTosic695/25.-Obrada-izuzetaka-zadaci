package paket;

public class Izuzetak extends Exception {
	
	private int indeksStudenta;
	
	Izuzetak(){
		indeksStudenta = -1;
	}
	Izuzetak(int indeksStudenta){
		super("Desio se izuzetak: Broj indeksa je veci od 100.");
		this.indeksStudenta = indeksStudenta;
	}
	
	public int getIndeksStudenta() {
		return indeksStudenta;
	}

}
