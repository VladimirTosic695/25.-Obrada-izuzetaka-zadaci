package _25_IzuzeciKnjigaDomaci;

import java.util.Scanner;

public class Knjiga {
	
	String naziv, autor, izdavac;
	
	public void setNaziv() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite naziv knjige");
		naziv = sc.nextLine();
		
		if(naziv.isBlank()) {
			System.out.println("Morate uneti naziv knjige. Unesite ponovo.");
			setNaziv();
		} else {
			this.naziv = naziv;
		}
	}
		
		public void setAutor() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite autora knjige");
			autor = sc.nextLine();
			
			while (true) {
				if(autor.isBlank() || autor.isEmpty()) {
					System.out.println("Unesite autora!");
				} else {
					this.autor = autor;
					break;
				}
			}		
	}
		
		public void setIzdavac(String izdavac) {
			this.izdavac = izdavac;
		}
		
		public String toString() {
			return "Naziv: " + naziv + "\nAutor: " + autor + "\nIzdavac: " + izdavac;
		}

}
