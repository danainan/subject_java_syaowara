import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a,b,c:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double s = (1.0/2.0)*(a + b + c);
		double result = s * (s - a) * (s - b) * (s - c);
		double area = Math.sqrt(result);
		
		System.out.print("Area = " + area);
	}
}
