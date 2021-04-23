package FruitInheritence;

public class Kiwi extends Fruit{
	
	private String vitamin;
	private int packet;
	private int amount;
	
	
	public Kiwi(String n, double p, String v, int pac, int a) {
		super(n,p);
		this.vitamin = v;
		this.packet = pac;
		this.amount = a;
	}
	
	public double totalPrice() {
		return super.getPrice() * this.packet;
	}

	public int amountPerPacket() {
		return this.packet * this.amount;
	}
	
	public String printV() {
		return this.vitamin;
	}
}
