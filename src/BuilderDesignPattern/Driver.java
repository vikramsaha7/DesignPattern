package BuilderDesignPattern;

import BuilderDesignPattern.entities.Dog;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog(new Dog.DogBuilder().setGender("male").setName("Rambo"));
		System.out.println(d1);
	}

}
