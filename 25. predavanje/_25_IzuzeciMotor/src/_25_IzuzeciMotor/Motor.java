package _25_IzuzeciMotor;

public class Motor {
	
	String marka;
	double kubikaza;
	
	public String getMarka() {
		return marka;
	}
	public double getKubikaza() {
		return kubikaza;
	}
	
	public void setMarka(String marka) throws Exception {
		if(marka.isBlank())
			throw new Exception("Greska! Marka polje je prazno");
		else 
			this.marka = marka;
	}
	
	public void setKubikaza(double kubik) throws Exception {
		if(kubik < 50 || kubik > 2000)
			throw new Exception("Kubikaza mora biti 50-2000!");
		else
			kubikaza = kubik;
	}
	
	public String toString () {
		return "Marka: " + marka + "\nKubikaza: " + kubikaza;
	}

}
