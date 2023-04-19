package UUP;


public class FinallyAndThrow {
	
	static void metodaA() {
		try {
			System.out.println("Unutar metodeA");
			throw new RuntimeException("Nesto za izuzetak");
		} finally {
			System.out.println("Svaka cast! ");
		}
	}
	 
	static void metodaB () {
		try { 
			System.out.println("Unutar metodeB");

		return; // break, continue, system.exit(0); Bilo koja od tih komandi za izlazak iz try bloka ne utice
		         // na izvrsenje finally
		} finally {
		System.out.println("Metoda B finally");
		}
	}
	
	static void metodaC() {
		try {
			System.out.println("Unutar metode C");
		} finally {
			System.out.println("Metoda C finnaly");
		}
	}
	
	// izvrsenje try bloka normalno 
}
