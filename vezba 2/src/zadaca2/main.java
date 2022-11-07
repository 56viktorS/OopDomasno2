package zadaca2;

public class main {
	public static void main(String[] args) {
		Student obj1 = new Student();
		
		obj1.firstName = "Stefan";
		obj1.lastName = "Stefanovski";
		obj1.index = 2222;
		
		System.out.println("Податоци за прв објект:");
		System.out.println(obj1.firstName + " " + obj1.lastName + " " + obj1.index);
	
		Student obj2 = new Student("Angela", "Angelovska", 3333);
		
		System.out.println ("Податоци за втор објект:");
		System.out.println (obj2.firstName + " " + obj2.lastName + " " + obj2.index);
	}
}