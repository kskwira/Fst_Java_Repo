package first;

public class Car {
	String brand;
	boolean isNew;
	int milleage;
	double price;
	
	void printCar(){
		System.out.println("Marka: " + brand);
		System.out.println("Nowy: " + isNew);
		System.out.println("Przebieg: " + milleage);
		System.out.println("Cena: " + price);
	}

	Car(){
		System.out.println("Inicjacja z nowego konstruktora");
	}
	
	Car(String brand){
		this();
		this.brand=brand;
	}
	
	Car(String brand, boolean isNew, int milleage, double price){
		this(brand);
		this.isNew = isNew;
		this.milleage = milleage;
		this.price = price;
	}
}
