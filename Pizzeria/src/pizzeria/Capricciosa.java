package pizzeria;

public class Capricciosa extends Pizza {
	
	public Capricciosa() {
		ostrosc = 1;
		opis = "Capricciosa (pieczarki, sos, szynka)";
	}
	
	public double cena() {
		return 22;
	}
	
	public static String opis() {
		return "Capricciosa (pieczarki, sos, szynka)";
	}
	
	public static String ostrosc() {
		return "Ostrosc: 1";
	}
	
}