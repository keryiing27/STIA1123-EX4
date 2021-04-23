package FruitInheritence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit objF = new Fruit("Orange", 6.99);
		Apple objA = new Apple("Apple", 5, 2.99);
		Grape objG = new Grape("Grape", 13.99, 1.05, "Vitamin K");
		Kiwi objK = new Kiwi("Kiwi", 14.99, "Vitamin C", 3, 5);
		Fuji objFj = new Fuji("Fuji Apple", 7, 2.59, "Japan", 0.29);
		GrannySmith objGs = new GrannySmith("Granny Smith", 8, 2.59, "Australia", 95, 2);
	
		System.out.println("---------------------------------");
		System.out.println("===ORANGE===");
		System.out.printf("Total Price of Orange: RM %.2f%n", objF.getPrice());
		
		System.out.println("---------------------------------");
		System.out.println("===APPLE===");
		System.out.printf("Total Price of Apple: RM %.2f%n", objA.totalPrice());
		
		System.out.println("---------------------------------");
		System.out.println("===GRAPE===");
		System.out.printf("Total Price of Grape: RM %.2f%n", objG.totalPrice());
		System.out.println("=>Grape is a good source of " + objG.printV());
		
		System.out.println("---------------------------------");
		System.out.println("===KIWI===");
		System.out.printf("Total Price of Kiwi      : RM %.2f%n", objK.totalPrice());
		System.out.printf("Amount of Kiwi per packet: %d%n", objK.amountPerPacket());
		System.out.println("=>Kiwi is high in " + objK.printV());
		
		System.out.println("---------------------------------");
		System.out.println("===FUJI APPLE===");
		System.out.printf("Total Price of Fuji Apple   : RM %.2f%n", objFj.totalPrice());
		System.out.printf("Average Weight of Fuji Apple: %.2f kg%n", objFj.calAverWeight());
		System.out.println("=>Fuji Apple developed in " + objFj.getCountry());
		
		System.out.println("---------------------------------");
		System.out.println("===GRANNY SMITH APPLE===");
		System.out.printf("Total Price of Granny Smith Apple: RM %.2f%n", objGs.totalPrice());
		System.out.println("Total Calories (if ate " + objGs.getAmount() + " apples) : "+ objGs.calCalories() + " calories");
		System.out.println("=>Granny Smith Apple is orignated in " + objGs.getCountry());
		objGs.bakeApplePie();
		
		
	}
	
}
