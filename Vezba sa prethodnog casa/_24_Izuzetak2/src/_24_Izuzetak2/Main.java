package _24_Izuzetak2;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			int a = 1;
			
			int b = 10 / a;
			
			int c[] = {1};
			c[10] = 100;
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Deljenje nulom " + e);
	/*	} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nepostojeci indeks unutar niza");
		*/}
		
		
		
		}

}
