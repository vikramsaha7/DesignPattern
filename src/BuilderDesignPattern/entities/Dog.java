package BuilderDesignPattern.entities;

public class Dog {
	private String name;
	private String gender;
	private String breed;
	private double price;
	public Dog(DogBuilder builder) {
		super();
		this.name = builder.getName();
		this.gender = builder.getGender();
		this.breed = builder.getBreed();
		this.price = builder.getPrice();
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getBreed() {
		return breed;
	}
	public double getPrice() {
		return price;
	}
	private void setName(String name) {
		this.name = name;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	private void setBreed(String breed) {
		this.breed = breed;
	}
	private void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", gender=" + gender + ", breed=" + breed + ", price=" + price + "]";
	}
	public Dog build() {
		return this;
	}
	public static class DogBuilder{
		private String name;
		private String gender;
		private String breed;
		private double price;
		public String getName() {
			return name;
		}
		public String getGender() {
			return gender;
		}
		public String getBreed() {
			return breed;
		}
		public double getPrice() {
			return price;
		}
		public DogBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public DogBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		public DogBuilder setBreed(String breed) {
			this.breed = breed;
			return this;
		}
		public DogBuilder setPrice(double price) {
			this.price = price;
			return this;
		}
//		public DogBuilder build() {
//			return this;
//		}
	}
	
}
