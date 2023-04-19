package paket;

public class Main {

	public static void main(String[] args) {
		
		Automobil a1 = new Automobil();
		
		a1.nazivAuta();
		a1.proizvodjacAuta();
		a1.godisteAuta();
		a1.potrosnjaAuta();

		System.out.println("Uneti podaci o vozilu: ");
		System.out.println(a1.toString());
		
	}

}
