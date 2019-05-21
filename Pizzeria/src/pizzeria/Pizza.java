package pizzeria;

public abstract class Pizza {
	
	String opis = "";
	int ostrosc = 0;
	String rozmiar = "";
	String adres = "";
	
	public String pobierzOpis() {
		return opis;
	}
	
	public int pobierzOstrosc() {
		return ostrosc;
	}
	
	public String pobierzRozmiar() {
		return rozmiar;
	}
	
	public String pobierzAdres() {
		return adres;
	}
	
	public abstract double cena();
	
}