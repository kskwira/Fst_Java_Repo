package pizzeria;

import java.util.Scanner;

public class Dostawa extends Dekorator {
	
	Pizza pizza;
	Scanner sc = new Scanner(System.in);

    public Dostawa(Pizza pizza) {
        this.pizza = pizza;
        System.out.println("Podaj adres dostawy");
        this.adres = sc.nextLine();
    }
    
    public String pobierzOpis() {
        return pizza.pobierzOpis();
    }
    
    public int pobierzOstrosc() {
		return pizza.pobierzOstrosc();
	}
    
	public String pobierzRozmiar() {
		return pizza.pobierzRozmiar();
	}
	
	public String pobierzAdres() {
		return adres;
	}
    
    public double cena() {
        return 6 + pizza.cena();
    }
    
}