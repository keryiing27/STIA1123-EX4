package Inheritance;

import java.util.Scanner;

public class Accessories {
	Scanner sc = new Scanner(System.in);
	
	private	String brand, color;
	private	double price;
	private int amount;
		
		Accessories(){
			System.out.println("Enter the brand of the Accessories: ");
			this.brand = sc.nextLine();
			System.out.println("Enter the color: ");
			this.color = sc.nextLine();
			System.out.println("Enter the price: ");
			this.price = sc.nextDouble();
			System.out.println("Enter the amount of purchase: ");
			this.amount = sc.nextInt();
		}
		
		Accessories(String b, String c, double p, int a){
			this.brand = b;
			this.color = c;
			this.price = p;
			this.amount = a;	
		}
		
		public String getBrand() {
			return this.brand;
		}
		public String getColor() {
			return this.color;
		}
		public double getPrice() {
			return this.price;
		}
		public int getAmount() {
			return this.amount;
		}

		public double totalPurchase() {
			return this.price * this.amount;
		}
		
		public String toString() {
			return "Brand                : " + brand + "\n" +
				   "Color                : " + color + "\n" +
				   "Price                : RM " + price + "\n" +
				   "Amount               : " + amount;
					
		}			
}
