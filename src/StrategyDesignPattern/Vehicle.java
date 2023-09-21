package StrategyDesignPattern;
import StrategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
	private DriveStrategy driveObject;

	public Vehicle(DriveStrategy driveObject) {
		super();
		this.driveObject = driveObject;
	}
	
	public void drive() {
		driveObject.drive();
	}
}
