package Overriding_Overloading;

public class Fuji extends Apple{
	
	private String country;
	private double weight;
	
	public Fuji(String n, int q, double p, String c, double w) { // constructor with 5 args
		super(n,q,p);
		this.country = c;
		this.weight = w;
	}
	public String total(int q, double p, double yen) { // overloading with 3 parameters
		return String.format("Total Price of %d Fuji Apples: RM %.2f", q, (q * p * yen));
	}
	
	public String getCountry() { //overloading with no parameter
		return this.country;
	}
	/*public double calAver(int q) { // overloading with 1 parameter
		return this.weight / q;
	}*/
	
	public String calAver(int q) { // overloading method with 1 parameter
		return String.format("The Average Weight of Apples: %.2f", (this.weight / q));
	}
	
	public String toString() { // overriding method
		return "=>Granny Smith Apple is orignated in " ;
	}
	
	
	
}
