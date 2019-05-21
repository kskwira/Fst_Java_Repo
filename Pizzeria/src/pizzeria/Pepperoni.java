package pizzeria;

public class Pepperoni extends Pizza {
		
	public Pepperoni() {
		ostrosc = 5;
		opis = "Pepperoni (salami, papryka ostra, cebula, ser)";
	}
	
	public double cena() {
		return 25;
	}
	
	public static String opis() {
		return "Pepperoni (salami, papryka ostra, cebula, ser)";
	}
	
	public static String ostrosc() {
		return "Ostrosc: 5";
	}
	
}