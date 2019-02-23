package first;

public class First {

	public static void main(String[] args) {

		Car car = new Car();
		car.brand = "BMW";
		car.isNew = true;
		car.milleage = 0;
		car.price = 100000.99;
		
		System.out.println("Marka: " + car.brand);
		System.out.println("Nowy: " + car.isNew);
		System.out.println("Przebieg: " + car.milleage);
		System.out.println("Cena: " + car.price);

	}

}
