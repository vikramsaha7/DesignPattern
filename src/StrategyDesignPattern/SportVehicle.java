package StrategyDesignPattern;
import StrategyDesignPattern.strategy.SpecialDriveStrategy;

public class SportVehicle extends Vehicle {

	public SportVehicle() {
		super(new SpecialDriveStrategy());
	}

}

