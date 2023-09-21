package FactoryDesignPattern;

import FactoryDesignPattern.factory.AbstractFactory;
import FactoryDesignPattern.factory.RoundedShapeFactory;
import FactoryDesignPattern.factory.ShapeFactory;

public class FactoryProducer {
	public AbstractFactory getFactory(boolean isRounded) {
		if(isRounded) {
			return new RoundedShapeFactory();
		}
		else {
			return new ShapeFactory();
		}
	}
}
