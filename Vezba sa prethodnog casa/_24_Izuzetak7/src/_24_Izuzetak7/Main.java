package _24_Izuzetak7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static int kolicnik(int a, int b) throws ArithmeticException {
		return a / b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean log = true;
		
		
		try {
			System.out.println("Unesite imenilac");
			int imenilac = sc.nextInt();
			System.out.println("Unesite brojilac");
			int brojilac = sc.nextInt();
			
			int rez = kolicnik(imenilac, brojilac);
			
			System.out.println("Rezultat: " + rez);
			
		} catch (ArithmeticException e) {
			System.out.println("Uhvacen izuzetak " + e);
		} catch(InputMismatchException e) {
			System.out.println("Unesite ceo broj " + e);
		}
		
		sc.close();

	}

}
