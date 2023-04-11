import java.util.Scanner;

public class CalRect {

	public static void main(String[] args) {
		// variable
		Scanner sc = new Scanner(System.in);
			
		// process or output
		System.out.print("Enter length (inches) :");
		int length = sc.nextInt();
		
		System.out.print("Enter width :");
		int width = sc.nextInt();
		
		// calculate
		int perimeter = 2*(length + width);
		int area = length * width;
		
		//Display
		System.out.println("Perimeter :"+ perimeter);
		System.out.println("Area :"+ area);
	}
}
