package _24_Izuzetak1;

public class Main {

	public static void main(String[] args) {
		int d, a;
		
		try {
		
			d = 0;
			a = 10 / d;
			
		System.out.println("Ova poruka nece biti odstampana jer je izuzetak uhvacen ranije");
		
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom!");
		}
		
		System.out.println("Nastavak programa");

	}

}
