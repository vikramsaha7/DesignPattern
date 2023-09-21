package StrategyDesignPattern;

public class Main {

	public static void main(String[] args) {
		System.out.println("Strategy Design Pattern");
		//Vehicle vehicle = new PassengerVehicle();
		Vehicle vehicle = new SportVehicle();
		vehicle.drive();
	}

}
