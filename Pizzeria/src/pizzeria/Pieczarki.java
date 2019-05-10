package pizzeria;

public class Pieczarki extends Dekorator {
    
	Pizza pizza;
	
    public Pieczarki(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", extra pieczarki";
    }
    
    public int pobierzOstrosc() {
    	return pizza.pobierzOstrosc() + 1;
    }
    
    public String pobierzRozmiar() {
        return pizza.pobierzRozmiar();
    }
	
	public String pobierzAdres() {
		return pizza.pobierzAdres();
	}
    
    public double cena() {
        return 2 + pizza.cena();
    }
    
}
