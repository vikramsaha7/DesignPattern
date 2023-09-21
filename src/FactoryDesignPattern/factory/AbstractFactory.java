package FactoryDesignPattern.factory;

import FactoryDesignPattern.shape.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shape);
}
