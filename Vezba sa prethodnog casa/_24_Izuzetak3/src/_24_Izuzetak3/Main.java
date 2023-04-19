package _24_Izuzetak3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite a");
		int a = sc.nextInt();
		System.out.println("Unesite b");
		int b = sc.nextInt();
		
		try {
			
			int kol = a / b;
			System.out.println(kol);
		
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom " + e);
		}
		
		
	}

}
