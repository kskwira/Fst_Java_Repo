package pizzeria;

public class Duza extends Dekorator {
    
	Pizza pizza;
    
	public Duza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public String pobierzOpis() {
        return pizza.pobierzOpis();
    }
	
	public int pobierzOstrosc() {
		return pizza.pobierzOstrosc();
	}
	
	public String pobierzRozmiar() {
        return pizza.pobierzRozmiar() + "duza";
    }
	
	public String pobierzAdres() {
		return pizza.pobierzAdres();
	}
    
	public double cena() {
        return 10 + pizza.cena();
    }

}