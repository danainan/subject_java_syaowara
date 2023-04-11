import java.util.Scanner;

public class MaxMinMean {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count,i,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,sum=0,age;
		double avg=0;
		
		System.out.print("Please enter number of people: ");
		count = input.nextInt();
		
		for(i = 0;i < count;i++) {
			System.out.print("Age of no. "+(i+1)+" : ");
			age = input.nextInt();
			
			sum = sum + age;
			if(max < age) max = age;
			if(min > age) min = age; 
		}
		avg = (double)sum / (double)count;
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
		System.out.println("Summary : "+sum);
		System.out.println("Average : "+avg);
	}
}
