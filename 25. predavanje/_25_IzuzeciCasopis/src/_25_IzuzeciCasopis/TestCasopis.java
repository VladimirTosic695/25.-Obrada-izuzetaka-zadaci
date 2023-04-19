package _25_IzuzeciCasopis;

import java.util.Scanner;

public class TestCasopis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite naslov");
		String naslov = sc.nextLine();
		System.out.println("Unesite izdavaca");
		String izdavac = sc.nextLine();
		System.out.println("Unesite broj casopisa");
		int broj = sc.nextInt();
		System.out.println("Unesite cenu casopisa");
		double cena = sc.nextDouble();
		
		Casopis c = new Casopis();
		
		try {
			c.setNaslov(naslov);
			c.setIzdavac(izdavac);
			c.setBrojCasopisa(broj);
			c.setCena(cena);
			
			System.out.println(c.toString());
			
			
		} catch (IzuzetakCasopis e) {
			System.out.println(e.getMessage());
		}

	}

}
