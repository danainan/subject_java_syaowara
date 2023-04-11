import java.util.Scanner;

public class Profit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cost Price:");
		int cost = sc.nextInt();
		
		int price = cost+(cost*8/10);
		int sell = price-(price/10);
		int profit = sell-cost;
		
		System.out.println("Marked up price: "+price);
		System.out.println("Selling price: "+sell);
		System.out.println("Profit: "+profit);
	}
}
