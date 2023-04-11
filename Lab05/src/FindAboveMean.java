import java.util.Scanner;

public class FindAboveMean {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] number;
		char check = 'y';
		int i;
		
		do {
		int sum = 0,CountAboveMean = 0;
		double mean;	
			
		System.out.print("Enter n: ");
		int n = input.nextInt();
		number = new int[n];
		
		System.out.println("Enter "+n+" numbers:");
		for (i = 0; i < n; i++) {
			number[i] =  input.nextInt();
			sum+=number[i];
		}
		mean = sum/(double)n;
		System.out.printf("Mean : %.2f" ,mean);
		for (i = 0; i < n; i++) {
			if(number[i] > mean) {
				CountAboveMean+=1;
			}
		}
		System.out.println();
		System.out.print("No. above mean : "+CountAboveMean+" as: ");
		for (i = 0; i < n; i++) {
			if(number[i] > mean) {
				System.out.print(number[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Do you want to continue [y/n] : ");
		check = input.next().charAt(0);
		}while(check == 'y');
		System.out.print("Bye Bye !!!");
	}

}
