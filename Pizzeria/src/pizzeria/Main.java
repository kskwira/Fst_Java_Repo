package pizzeria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Pizza pizza = null;
		
		Scanner sc = new Scanner(System.in);
		int rodzaj = 0;
		int skladniki = 0;
		int rozmiar = 0;
		int dostawa = 0;
		
		do {
			System.out.println("Witamy w systemie zamowien \"Pizzeria Shiva\":");
			System.out.println("Ktora pizze chcialbys zamowic?");
			System.out.println("[1] " + Capricciosa.opis() + "; " + Capricciosa.ostrosc());
			System.out.println("[2] " + Wegetarianska.opis() + "; " + Wegetarianska.ostrosc());
			System.out.println("[3] " + Pepperoni.opis() + "; " + Pepperoni.ostrosc());
			System.out.println("[4] " + Hawajska.opis() + "; " + Hawajska.ostrosc());
			rodzaj = sc.nextInt();
		} while (rodzaj >= 5 || rodzaj <= 0);

		if (rodzaj == 1)
			pizza = new Capricciosa();
		else if (rodzaj == 2)
			pizza = new Wegetarianska();
		else if (rodzaj == 3)
			pizza = new Pepperoni();
		else if (rodzaj == 4)
			pizza = new Hawajska();
	
		do {
			System.out.println("Czy chcesz dodac skladniki do swojej pizzy?");
			System.out.println("[1] Tak");
			System.out.println("[2] Nie");
			skladniki = sc.nextInt();
		} while (skladniki >= 3 || skladniki <= 0);
		
		if (skladniki == 1) {
			do {
				System.out.println("Wybierz dodatkowy skladnik:");
				System.out.println("[1] Ser (Ostrosc +0)");
				System.out.println("[2] Szynka (Ostrosc +0)");
				System.out.println("[3] Pieczarki (Ostrosc +1)");
				System.out.println("[0] Zakoncz");
				skladniki = sc.nextInt();
				switch (skladniki) {
				case 1:
					pizza = new Ser(pizza);
					break;
				case 2:
					pizza = new Szynka(pizza);
					break;
				case 3:
					pizza = new Pieczarki(pizza);
					break;
				case 0:
					break;
				default:
					System.out.println("Prosze wybrac jeden z dostepnych skladnikow.");
				}
			} while (skladniki != 0);
		}
		
		do {
			System.out.println("Jaki rozmiar pizzy wybierasz?");
			System.out.println("[1] Mala");
			System.out.println("[2] Srednia");
			System.out.println("[3] Duza");
			rozmiar = sc.nextInt();
		} while (rozmiar <= 0 || rozmiar >= 4);
				
		if (rozmiar == 1)
			pizza = new Mala(pizza);
		else if (rozmiar == 2)
			pizza = new Srednia(pizza);
		else if (rozmiar == 3)
			pizza = new Duza(pizza);

		do {
			System.out.println("Wybierz sposob dostawy: ");
			System.out.println("[1] Odbior osobisty");
			System.out.println("[2] Dowoz");
			dostawa = sc.nextInt();
		} while (dostawa <= 0 || dostawa >= 3);
				
		if (dostawa == 1)
			pizza = new Odbior(pizza);
		else
			pizza = new Dostawa(pizza);
		
		
		System.out.println("Dziekujemy za zamowienie z \"Pizzeria Shiva\".");
		System.out.println("Twoje zamowienie:");
		System.out.println(pizza.pobierzOpis() + ", Rozmiar: " + pizza.pobierzRozmiar() + ", Ostrosc: " + pizza.pobierzOstrosc() + ", Cena: " + pizza.cena() + " zl" + ", Adres dostawy/odbioru: " + pizza.pobierzAdres());
	}
	
}