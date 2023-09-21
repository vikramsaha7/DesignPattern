package StrategyDesignPattern;
import StrategyDesignPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

	public PassengerVehicle() {
		super(new NormalDriveStrategy());
	}

}

