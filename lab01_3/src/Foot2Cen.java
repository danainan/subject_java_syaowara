import java.util.Scanner;

public class Foot2Cen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter feet and inch:");
		
		int feet = sc.nextInt();
		int inch = sc.nextInt();
		System.out.println("You are "+feet+" feet, "+inch+" inches tall.");
		
		int total = (feet*12)+inch;
		System.out.println("Total inches: "+total);
		
		double cen = total*2.54;
		System.out.println("Total centimeter:"+cen+" cm");
		
	}
}
