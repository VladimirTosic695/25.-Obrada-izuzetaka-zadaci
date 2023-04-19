package UUP;

public class Prikaz {

	public static void main(String[] args) {
	
		
		try {
		FinallyAndThrow.metodaA();
		
		} catch (Exception e) {
			System.out.println("Uhvacen izuzetak " + e);
		}
		FinallyAndThrow.metodaB();
		FinallyAndThrow.metodaC();

	}

}
