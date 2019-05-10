package pizzeria;

public class Mala extends Dekorator {
	
    Pizza pizza;
    
    public Mala(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public String pobierzOpis() {
        return pizza.pobierzOpis();
    }
    
    public int pobierzOstrosc() {
		return pizza.pobierzOstrosc();
	}
    
	public String pobierzRozmiar() {
        return pizza.pobierzRozmiar() + "mala";
    }
	
	public String pobierzAdres() {
		return pizza.pobierzAdres();
	}
    
    public double cena() {
        return 0 + pizza.cena();
    }
	
}