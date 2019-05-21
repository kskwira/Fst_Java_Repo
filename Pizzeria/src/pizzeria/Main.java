package pizzeria;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Pizza pizza = null;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Pizza> order = new ArrayList<Pizza>();
		int rodzaj = 0;
		int skladniki = 0;
		int rozmiar = 0;
		int dostawa = 0;
		int suma = 0;
		int jump = 0;
		
		System.out.println("Witamy w systemie zamowien \"Pizzeria Shiva\":");
		
		do {
			
			do {
				System.out.println("Ktora pizze chcialbys zamowic?");
				System.out.println("[1] " + Capricciosa.opis() + "; " + Capricciosa.ostrosc() + "; Cena: 22zl");
				System.out.println("[2] " + Wegetarianska.opis() + "; " + Wegetarianska.ostrosc() + "; Cena: 20zl");
				System.out.println("[3] " + Pepperoni.opis() + "; " + Pepperoni.ostrosc() + "; Cena: 25zl");
				System.out.println("[4] " + Hawajska.opis() + "; " + Hawajska.ostrosc() + "; Cena: 23zl");
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
				System.out.println("Czy chcesz dodac skladniki do swojej pizzy? (cena = +2zl)");
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
				System.out.println("[2] Srednia (cena = +5zl)");
				System.out.println("[3] Duza (cena = +10zl)");
				rozmiar = sc.nextInt();
			} while (rozmiar <= 0 || rozmiar >= 4);
			
			if (rozmiar == 1)
				pizza = new Mala(pizza);
			else if (rozmiar == 2)
				pizza = new Srednia(pizza);
			else if (rozmiar == 3)
				pizza = new Duza(pizza);
			
			order.add(pizza);
			suma += pizza.cena();
			
			System.out.println("Czy chcesz zamowic kolejna pizza?");
			System.out.println("[0] Tak");
			System.out.println("[1-9] Nie");
			jump = sc.nextInt();
		}while (jump == 0);
		
		do {
			System.out.println("Wybierz sposob dostawy: ");
			System.out.println("[1] Odbior osobisty");
			System.out.println("[2] Dostawa (cena = +6zl)");
			dostawa = sc.nextInt();
		} while (dostawa <= 0 || dostawa >= 3);
				
		if (dostawa == 1)
			pizza = new Odbior(pizza);
		else
		{
			pizza = new Dostawa(pizza);
			suma += 6;
		}
				
		System.out.println("Dziekujemy za zamowienie w \"Pizzeria Shiva\".");
		System.out.println("Twoje zamowienie:");
		
		for (int i = 0; i < order.size(); i++)
		{
			System.out.println(order.get(i).pobierzOpis() + ", Rozmiar: " + order.get(i).pobierzRozmiar()  + ", Ostrosc: " + order.get(i).pobierzOstrosc() +  ", Cena: " + order.get(i).cena() + " zl");
		}
		
		System.out.println("Adres dostawy/odbioru: " + pizza.pobierzAdres());
		System.out.println("£aczna kwota zamowienia: " + suma + " zl");
		
	}
	
}