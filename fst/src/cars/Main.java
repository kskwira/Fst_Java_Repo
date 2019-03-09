package cars;

public class Main {

	public static void main(String[] args) 
	{
		Car car = new Car("BMW", true, 0, 100000.99);
		car.printCar();
		System.out.println("===> zmieniam wartości");
		
		car.setMileage(100);
		
		System.out.println("nowy przebieg: " + car.getMileage());
		car.setBrand("Toyota");
		car.printCar();
		Car car_2 = new Car ("maluch", false, 10, 20000.00);
		car_2.printCar();

	}

}
