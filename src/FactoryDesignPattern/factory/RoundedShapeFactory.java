package FactoryDesignPattern.factory;

import FactoryDesignPattern.shape.Rectangle;
import FactoryDesignPattern.shape.RoundedRectangle;
import FactoryDesignPattern.shape.RoundedSquare;
import FactoryDesignPattern.shape.Shape;
import FactoryDesignPattern.shape.Square;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape=="RoundedRectangle")
			return new RoundedRectangle();
		else 
			return new RoundedSquare();
	}

}
