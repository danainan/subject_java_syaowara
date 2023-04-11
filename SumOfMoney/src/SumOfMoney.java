import java.util.Scanner;

public class SumOfMoney {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double number;
		int sum=0;
		
		System.out.println("Enter numbers [Exit press number <=0 ] : ");
		number = input.nextDouble();
		while (number > 0) {
			long round = Math.round(number);
			System.out.println("nearest Integer "+round);
			sum+=round;
			number = input.nextDouble();
		}
		System.out.print("Summary is "+sum);
	}
}
