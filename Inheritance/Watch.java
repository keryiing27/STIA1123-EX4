package Inheritance;

public class Watch extends Accessories{
	
	private	double disc;
	
	Watch(String b, String c, double p, int a, double d){
		super(b,c,p,a);
		disc = d;	
	}
	public double getDisc() {
		return disc*100;
	}
	public double discount() {
		return super.totalPurchase() * (1-disc);
	}
	public String toString() {
		return super.toString() + "\n" +
			   "Total Discount       : " + getDisc() + "%" ;
				
	}
	
}


