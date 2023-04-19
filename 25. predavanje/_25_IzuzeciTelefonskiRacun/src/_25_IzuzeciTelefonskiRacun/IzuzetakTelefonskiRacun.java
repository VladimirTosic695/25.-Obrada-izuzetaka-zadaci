package _25_IzuzeciTelefonskiRacun;

public class IzuzetakTelefonskiRacun extends RuntimeException {
	
	public IzuzetakTelefonskiRacun(String poruka) {
		super("Greska: " + poruka);
	}

}
