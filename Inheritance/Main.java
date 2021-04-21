package Inheritance;
import java.text.DecimalFormat;
public class Main {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessories objAcc = new Accessories();
		Watch objW = new Watch("Casio", "Black", 325.89, 2, 0.2);
		
		System.out.println("\n====Bracelet Properties====");
		System.out.println(objAcc);
		System.out.println("Total Purchase       : RM " + df2.format(objAcc.totalPurchase()));
		System.out.println("\n-----------------------------------------\n");
		
		System.out.println("====Watch Properties====");
		System.out.println(objW);
		System.out.println("Price After Discount : RM "+ df2.format(objW.discount()));
	}
	

}
