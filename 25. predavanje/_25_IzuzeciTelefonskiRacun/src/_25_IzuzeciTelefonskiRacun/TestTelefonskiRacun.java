package _25_IzuzeciTelefonskiRacun;

import java.util.Scanner;

public class TestTelefonskiRacun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite ime vlasnika racuna");
		String ime = sc.nextLine();
		System.out.println("Unesite broj telefona");
		String broj = sc.nextLine();
		System.out.println("Unesite njegovo dugovanje");
		double dug = sc.nextDouble();
		
		TelefonskiRacun tr = new TelefonskiRacun();
		
		try {
			
			tr.setVlasnik(ime);
			tr.setBroj(broj);
			tr.setDug(dug);
			System.out.println("Vlasnik" + "\tBroj telefona" + "\tDugovanje");
			System.out.println(tr.toString());
			
		} catch (IzuzetakTelefonskiRacun ob) {
			System.out.println(ob.getMessage());
		}
		sc.close();
	}

}
