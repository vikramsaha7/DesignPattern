package FactoryDesignPattern.factory;

import FactoryDesignPattern.shape.Rectangle;
import FactoryDesignPattern.shape.Shape;
import FactoryDesignPattern.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape=="Rectangle")
			return new Rectangle();
		else 
			return new Square();
	}

}
