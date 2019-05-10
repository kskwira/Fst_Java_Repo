package pizzeria;

public class Wegetarianska extends Pizza {

	public Wegetarianska() {
		ostrosc = 0;
		opis = "Wegetarianska (papryka, pomidor, ser)";
	}
	
	public double cena() {
		return 20;
	}
	
	public static String opis() {
		return "Wegetarianska (papryka, pomidor, ser)";
	}
	
	public static String ostrosc() {
		return "Ostrosc: 0";
	}
	
}