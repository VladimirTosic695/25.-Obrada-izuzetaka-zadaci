package _25_IzuzeciTekuciRacun;

import java.util.Scanner;

public class TestTekuciRacun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite ime vlasnika racuna");
		String ime = sc.nextLine();
		System.out.println("Unesite broj tekuceg racuna");
		String tekuci = sc.nextLine();
		System.out.println("Unesite iznos");
		double iznos = sc.nextDouble();

		TekuciRacun tr = new TekuciRacun();
		
		try {
			tr.setVlasnik(ime);
			tr.setTekuci(tekuci);
			tr.setIznos(iznos);
			
			System.out.println(tr.toString());
			
		} catch (IzuzetakTekuciRacun e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		
	}

}
