package FruitInheritence;

public class GrannySmith extends Apple{
	
	private String country;
	private int calories, amount;
	
	public GrannySmith(String n, int q, double p, String c, int cal, int a) {
		super(n,q,p);
		this.country = c;
		this.calories = cal;
		this.amount = a;
		
	}

	public double totalPrice() {
		return super.totalPrice();
	}
	
	public String getCountry() { 
		return this.country;
	}
	
	public int calCalories() {
		return this.calories * this.amount;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	void bakeApplePie() { 
		System.out.println("=>It can be used to bake Apple Pie.");
	}
	
	
	
}
