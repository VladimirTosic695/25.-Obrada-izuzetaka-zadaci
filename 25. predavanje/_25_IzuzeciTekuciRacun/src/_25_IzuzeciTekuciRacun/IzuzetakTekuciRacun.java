package _25_IzuzeciTekuciRacun;

public class IzuzetakTekuciRacun extends RuntimeException {
	
	public IzuzetakTekuciRacun(String poruka) {
		super("Greska: " + poruka);
	}

}
