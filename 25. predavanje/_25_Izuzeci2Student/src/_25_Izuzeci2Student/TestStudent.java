package _25_Izuzeci2Student;

import java.io.IOException;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String prezime; 
		String adresa;
		int indeks;
		
		System.out.println("Unesite broj studenata za koje je potrebno uneti podatke");
		int b = sc.nextInt();
		
		Student st [] = new Student[b + 1];
		
		try {
		
		for(int i = 1; i <= b; i++) {
			
			
			System.out.println("Unesite prezime " + i + ". studenta.");
			prezime = sc.nextLine();
			System.out.println("Unesite ime " + i + ". studenta.");
			name = sc.nextLine();
			System.out.println("Unesite adresu " + i + ". studenta.");
			adresa = sc.nextLine();
			System.out.println("Unesite indeks " + i + ". studenta.");
			indeks = sc.nextInt();
			
			st[i] = new Student(name, prezime, adresa, indeks);
			
		}
		
		for(int i = 1; i <= b; i++) {
			st[i].ispisi();
		}
		} catch (Izuzetak e) {
			System.out.println(e.getMessage());
			System.out.println("Indeks studenta za koji se desio izuzetak: " + e.getIndeksstudenta());
		}
		
		
	}
}
