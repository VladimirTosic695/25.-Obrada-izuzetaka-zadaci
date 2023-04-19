package _25_Izuzeci3Artikal;

import java.util.Scanner;

public class TestArtikal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite naziv proizvoda");
		String naziv = sc.nextLine();
		System.out.println("Unesite proizvodjaca");
		String proizvodjac = sc.nextLine();
		System.out.println("Unesite barkod");
		String barkod = sc.nextLine();
		System.out.println("Unesite cenu proizvoda");
		double cena = sc.nextDouble();
		
		Artikal a = new Artikal();
		
		try {
			a.setNaziv(naziv);
			a.setProizvodjac(proizvodjac);
			a.setBarkod(barkod);
			a.setCena(cena);
			System.out.println(a.toString());
		} catch(IzuzetakArtikal e) {
			System.out.println("Uhvacen je izuzetak: " + e.getMessage());
			
		}

	}

}
