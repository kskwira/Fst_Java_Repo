package pizzeria;

public class Srednia extends Dekorator {
	
    Pizza pizza;
    
    public Srednia(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public String pobierzOpis() {
        return pizza.pobierzOpis();
    }
    
    public int pobierzOstrosc() {
		return pizza.pobierzOstrosc();
	}
    
	public String pobierzRozmiar() {
        return pizza.pobierzRozmiar() + "srednia";
    }
	
	public String pobierzAdres() {
		return pizza.pobierzAdres();
	}
    
    public double cena() {
        return 5 + pizza.cena();
    }
	
}