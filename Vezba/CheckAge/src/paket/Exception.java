package paket;

public class Exception {
	
	static void checkAge (int age) throws InvalidAgeException {
		
		System.out.println("Provera validnosti godina: "+ age);
		if (age < 0 || age > 100)
			throw new InvalidAgeException(age);
		System.out.println("This age (" + age + ") is valid age. ");
	} 

	public static void main(String[] args) {
		
		try {
			checkAge(30);
			checkAge(101);
		} catch (InvalidAgeException e) {
			System.out.println("Uhvacen izuzetak " + e);
		}

	}

}
