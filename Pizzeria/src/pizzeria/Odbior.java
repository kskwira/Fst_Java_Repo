package pizzeria;

import java.util.Scanner;

public class Odbior extends Dekorator {
	
	Pizza pizza;
	int punkt = 0;
	Scanner sc = new Scanner(System.in);


    public Odbior(Pizza pizza) {
        this.pizza = pizza;
        System.out.println("Wybierz punkt odbioru:");
		System.out.println("[1] Morska 169");
		System.out.println("[2] Bema 18");
		punkt = sc.nextInt();
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
		if (punkt == 1)
			adres = "Morska 169";
		else if (punkt == 2)
			adres = "Bema 18";
			
			return adres;
	}
    
    public double cena() {
        return 0 + pizza.cena();
    }
    
}