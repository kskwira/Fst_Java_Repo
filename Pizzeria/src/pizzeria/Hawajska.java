package pizzeria;

public class Hawajska extends Pizza {
	
	public Hawajska() {
		ostrosc = 0;
		opis = "Hawajska (szynka, ananas, ser)";
	}
	
	public double cena() {
		return 23;
	}
	
	public static String opis() {
		return "Hawajska (szynka, ananas, ser)";
	}
	
	public static String ostrosc() {
		return "Ostrosc: 0";
	}

}