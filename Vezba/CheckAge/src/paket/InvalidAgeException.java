	package paket;

public class InvalidAgeException extends Throwable {
	
	private int age;
	
	InvalidAgeException (int age){
		this.age = age;
	}
	
	public String toString() {
		return "Age " + age + " is not valid age. ";
	}

}
