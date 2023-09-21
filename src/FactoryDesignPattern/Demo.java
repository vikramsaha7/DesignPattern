package FactoryDesignPattern;

import FactoryDesignPattern.factory.AbstractFactory;
import FactoryDesignPattern.shape.RoundedRectangle;
import FactoryDesignPattern.shape.Shape;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryProducer fp=new FactoryProducer();
		AbstractFactory af=fp.getFactory(true);
		Shape s=af.getShape("RoundedRectangle");
		s.draw();
	}

}
