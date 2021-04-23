package FruitInheritence;

public class Fuji extends Apple{
	
	private String country;
	private double weight;
	
	public Fuji(String n, int q, double p, String c, double w) {
		super(n,q,p);
		this.country = c;
		this.weight = w;
	}
	public double totalPrice() {
		return super.totalPrice();
	}
	
	public String getCountry() {
		return this.country;
	}

	public double calAverWeight() {
		return this.weight / super.getQuantity();
	}
}
