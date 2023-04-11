import java.util.Scanner;

public class SumAToB {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0, count, n1, n2, sum;
		
		System.out.print("Enter no of loop: ");
		count = input.nextInt();
		
		while(i < count) {
			System.out.print("Start Number : ");
			n1 = input.nextInt();
			System.out.print("End Number : ");
			n2 = input.nextInt();
			sum = sumSeries(n1, n2); 
			
			System.out.println("Summary is "+sum);
			i++;
		}
	}
	public static int sumSeries(int n1, int n2) {
		int sum = 0 , i = n1;
		while (i <= n2) {
			if(i % 2 == 0) sum+=i;
			i++;
		}
		return sum;
	}
}
