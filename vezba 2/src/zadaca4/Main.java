package zadaca4;

public class Main {
	public static void main(String[] args) {
		Avtomobil obj1 = new Avtomobil();
		
		obj1.marka = "Audi";
		obj1.model = "A3";
		obj1.kilometraza = 145000;
		
		Avtomobil obj2 = new Avtomobil ("BMW", "320Ci", 120000);
		
		System.out.println(obj1.marka + " " + obj1.model + " " +obj1.kilometraza);
		System.out.println(obj2.marka + " " + obj2.model + " " +obj2.kilometraza);
	}
}