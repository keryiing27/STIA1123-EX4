package Overriding_Overloading;

public class GrannySmith extends Apple{
	
	private String country;
	private int calories, amount;
	
	public GrannySmith(String n, int q, double p, String c, int cal, int a) {
		// constructor with 6 args
		super(n,q,p);
		this.country = c;
		this.calories = cal;
		this.amount = a;
		
	}

	public String total(int q, double p, double aus) { //overloading with 3 parameters
		return String.format("Total Price of %d Granny Smith Apples: AU$ %.2f", q, ( q * p * aus));
	}
	
	public String getCountry() { 
		return this.country;
	}
	
	public int calCalories(int cal, int a) { //overloading with 2 parameters
		return this.calories * this.amount;
	}
	
	public String calCalories() { //overloading with no parameter
		return "Total calories: ";
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void bakeApplePie() { 
		System.out.println("=>It can be used to bake Apple Pie.");
	}
	
	public String toString() {
		return "=>Granny Smith Apple is orignated in " ;
	}
	
	
}
