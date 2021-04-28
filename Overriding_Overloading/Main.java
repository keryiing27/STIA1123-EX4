package Overriding_Overloading;

public class Main {

	
	public static void main(String[] args) {

		
		Fruit F = new Fruit("Orange", 5.5);
		
		System.out.println("===ORANGE===");
		System.out.println(F.total(5.5));
		System.out.println("---------------------------------");
		System.out.println();
		
		Apple A = new Apple("Apple", 5, 2.9);
		
		System.out.println("===APPLE===");
		System.out.println(A.total(5, 1.5));
		System.out.println(A.toString() + A.total(10));
		System.out.println("---------------------------------");
		System.out.println();
		
		Grape G = new Grape("Grape", 13.9, 1.1, "Vitamin K");
		
		System.out.println("===GRAPE===");
		System.out.println(G.total(12.9, 0.5, 0.31));
		System.out.println(G.toString() + G.printV());
		System.out.println("---------------------------------");
		System.out.println();
		
		Kiwi K = new Kiwi("Kiwi", 14.2, "Vitamin C", 3, 5, 0.2);
		
		System.out.println("===KIWI===");
		System.out.println(K.total(13.5, 2, 0.2));
		System.out.println(K.amountPerPacket() + K.amountPerPacket(3, 5));
		System.out.println(K.toString() + K.printV());
		System.out.println("---------------------------------");
		System.out.println();
		
		Fuji Fj = new Fuji("Fuji Apple", 7, 2.6, "Japan", 0.29);
		
		System.out.println("===FUJI APPLE===");
		System.out.println(Fj.total(7, 1.6, 26.53));
		System.out.println(Fj.calAver(7) + " gm");
		System.out.println(Fj.toString() + Fj.getCountry());
		System.out.println("---------------------------------");
		System.out.println();
		
		GrannySmith Gs = new GrannySmith("Granny Smith", 8, 2.4, "Australia", 95, 2);

		System.out.println("===GRANNY SMITH APPLE===");
		System.out.println(Gs.total(7, 2.4, 0.31));
		System.out.println(Gs.calCalories()+ Gs.calCalories(52, 3));
		System.out.println(Gs.toString() + Gs.getCountry());
		Gs.bakeApplePie();
		System.out.println("---------------------------------");
		System.out.println();
		
	}
	
}
