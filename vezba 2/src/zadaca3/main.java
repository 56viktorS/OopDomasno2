package zadaca3;

public class Main {
	public static void main (String[] args) {
		Covek obj1 = new Covek();
		
		obj1.ime = "Petre";
		obj1.prezime = "Petrevski";
		obj1.mBroj = "0902000483005";
		
		System.out.println("Imeto na covekot e: " + obj1.ime + ".");
		System.out.println("Prezimeto na covekot e: " + obj1.prezime + ".");
		System.out.println("Cvekot ima maticen broj: " + obj1.mBroj + ".");
	}
}