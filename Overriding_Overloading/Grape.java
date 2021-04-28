package Overriding_Overloading;

public class Grape extends Fruit{
	
	private double price, weight;
	private String vitamin;
	
	public Grape(String n, double p, double w, String v) { // constructor with 4 args
		super(n,p);
		this.weight = w;
		this.vitamin = v;
	}
	
	public String total(double p, double w, double sg) { // overloading with 2 parameters
		return String.format("Total Price of Grapes: $ %.2f" , (p * w * sg));
	}
	
	public String printV() { //overriding
		return vitamin;
	}
	
	public String toString() { //overriding method
		return "=>Grape is a good source of ";
	}
	
}
