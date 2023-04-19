package paket;

import java.io.IOException;
import java.util.Scanner;

public class Automobil {
	
	String naziv;
	String proizvodjac;
	int godiste;
	double potrosnja;
	
	public Automobil nazivAuta() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite naziv automobila");
		naziv = sc.nextLine();
		return this;
	}
	public void proizvodjacAuta() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite proizvodjaca automobila");
		proizvodjac = sc.nextLine();
	}
	public void godisteAuta() {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Unesite godiste auta");
		godiste = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Niste uneli ceo broj. Unesite ponovo!");
			godisteAuta();
		}
		
	}
	public void potrosnjaAuta() {
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Unesite potrosnju auta");
				potrosnja = sc.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("Neispravan unos potrosnje goriva. Unesite ponovo!");
			}
		}
	}
	public String toString() {
		return "Model: "+naziv+"\nProizvodjac: "+proizvodjac+"\nGodiste: "+godiste+"\nPotrosnja: "+potrosnja;
	}

}
