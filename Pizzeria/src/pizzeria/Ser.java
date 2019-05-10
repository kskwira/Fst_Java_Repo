package pizzeria;

public class Ser extends Dekorator {
    
	Pizza pizza;
	
    public Ser(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", extra ser";
    }
    
    public int pobierzOstrosc() {
    	return pizza.pobierzOstrosc() + 0;
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