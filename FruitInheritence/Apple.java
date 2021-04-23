package FruitInheritence;

public class Apple extends Fruit{
	private double price;
	private int quantity;
	
	public Apple(String name, int q, double p) {
		super(name,p);
		this.quantity = q;
		
	}
	
	public double totalPrice() {
		return super.getPrice() * this.quantity;
	}
	public double getQuantity() {
		return this.quantity;
	}
}

