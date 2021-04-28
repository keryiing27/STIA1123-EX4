package Overriding_Overloading;

public class Apple extends Fruit{
	private double price;
	private int quantity;
	
	public Apple(String name, int q, double p) { // constructor with 3 args
		super(name,p);
		this.quantity = q;
		
	}
	
	public String total(int q, double p) {  // overloading with 2 parameters
		return String.format("Total price of %d apples: RM %.2f", q ,(q * p));
	}
	public int total(int q) { // overloading with 1 parameter
		return q ;
	}
	
	public String toString() { // overriding method
		return "Total apples sold: ";
	}
}

