package Overriding_Overloading;

public class Kiwi extends Fruit{
	
	private String vitamin;
	private int packet;
	private int amount;
	private double discount;
	
	
	public Kiwi(String n, double p, String v, int pac, int a, double dis) { //constructor with 5 args
		super(n,p);
		this.vitamin = v;
		this.packet = pac;
		this.amount = a;
		this.discount = dis;
	}
	
	public String total(double p, int pac, double dis) { // overloading with 2 parameters
		return String.format("Total Price of Kiwi(packet): RM %.2f", (p * pac * dis));
	}
	
	public int amountPerPacket(int pac, int a) { // overloading with 2 parameters
		return this.packet * this.amount;
	}
	
	public String amountPerPacket() { // overloading with no parameter
		return "Amount of Kiwi per packet: ";
	}
	
	public String printV() { //overriding
		return this.vitamin;
	}
	
	public String toString() { // overriding
		return "=>Kiwi is high in " ;
	}
}
