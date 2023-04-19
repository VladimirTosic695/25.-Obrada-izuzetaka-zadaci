package paket;

import java.io.*;
import java.io.IOException;

public class TestIzuzetak {

	public static void main(String[] args) throws IOException {
		
		String ime, prezime, adresa;
		int indeks;
		
		Student [] st = new Student [10];
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite broj studenata");
		int n = Integer.parseInt(bf.readLine());
		
		try {
			for(int i = 1; i<=n; i++) {
				System.out.println("Unesite ime "+i+". studenta");
				ime = bf.readLine();
				System.out.println("Unesite prezime "+i+". studenta");
				prezime = bf.readLine();
				System.out.println("Unesite adresu "+i+". studenta");
				adresa = bf.readLine();
				System.out.println("Unesite broj indeksa "+i+". studenta");
				indeks = Integer.parseInt(bf.readLine());
				
				st [i] = new Student(ime, prezime, adresa, indeks);
			}
			System.out.println("Ime\tPrezime\tAdresa\tBroj Indeksa");
			for(int i = 1; i <= n; i++) {
				st [i].ispisi();
			}
		} catch (Izuzetak e) {
			e.getMessage();
			System.out.println("Indeks studenta za koji se desio izuzetak je "+e.getIndeksStudenta());
		}

	}

}
