package FruitInheritence;

public class Grape extends Fruit{
	
	private double price, weight;
	private String vitamin;
	
	public Grape(String n, double p, double w, String v) {
		super(n,p);
		this.weight = w;
		this.vitamin = v;
	}
	
	public double totalPrice() {
		return super.getPrice() * this.weight;
	}
	
	public String printV() {
		return vitamin;
	}
	
}
