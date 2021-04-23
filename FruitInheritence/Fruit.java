package FruitInheritence;

public class Fruit {
	private String name;
	private double price;
	
	public Fruit(String name, double p) {
		this.name = name;
		this.price = p;
		
		System.out.println(name + " constructor is invoked");
		
	}
	public double getPrice() {
		return this.price;
	}

}
