package _25_IzuzeciKnjigaDomaci;

import java.util.Scanner;

public class TestKnjiga {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Knjiga k = new Knjiga();
		
		try {
			
			k.setNaziv();
			k.setAutor();
			System.out.println("Unesite izdavaca knjige");
			String izdavac = sc.nextLine();
			k.setIzdavac(izdavac);
			System.out.println(k.toString());
			
		} catch (Exception e) {
			System.out.println("Greska!" + e.getMessage());
		}

	}

}
