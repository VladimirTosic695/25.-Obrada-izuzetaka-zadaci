package _25_IzuzeciMotor;

import java.util.Scanner;

public class TestMotor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Motor m = new Motor();

		System.out.println("Unesite marku motora");
		String marka = sc.nextLine();

		System.out.println("Unesite kubikazu");
		double kub = sc.nextDouble();
		try {
			m.setMarka(marka);
			m.setKubikaza(kub);

			System.out.println(m.toString());

		} catch (Exception e) {
			System.out.println("Uhvacen izuzetak: " + e.getMessage());
		}

	}

}
