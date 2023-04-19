package _25_Izuzeci1Automobil;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Automobil {
	
	String naziv, proizvodjac;
	int godiste;
	double potrosnja;
	
	public void unetiNazivAutomobila() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite naziv auta");
		naziv = sc.nextLine();

	}
	
	public void unetiProizvodjacaAutomobila() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite proizvodjaca auta");
		proizvodjac = sc.nextLine();
		
	}
	public void unetiGodisteAutomobila() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Unesite godiste auta");
				godiste = sc.nextInt();
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("Niste pravilno uneli godiste automobila. Unesite ponovo.");
			}
		}
	}
		public void unetiPotrosnjuAutomobila() {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Unesite potrosnju auta");
				potrosnja = sc.nextDouble();
				
			} catch (InputMismatchException e) {
				System.out.println("Unesite ponovo potrosnju.");
				unetiPotrosnjuAutomobila();
			}
		}
	public String toString () {
		return "Auto: " + naziv + "\nProizvodjac: " + proizvodjac + "\nGodiste: " + godiste + "\nPotrosnja: " + potrosnja;
	}

}
