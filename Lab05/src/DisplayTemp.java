import java.util.Scanner;

public class DisplayTemp {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int[] A = new int[12];
		String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int maxIndex,minIndex;
		
		for (int i = 0;i < A.length; i++) {
			System.out.print("Please enter temp of "+month[i]+": ");
			A[i] = input.nextInt();
		}
	
		maxIndex = maxPosTemp(A);
		minIndex = minPosTemp(A);
		System.out.println("Maximun temp is "+A[maxIndex]+" and "+A[maxIndex]+" is a temp of "+month[maxIndex]+".");
		System.out.println("Minimun temp is "+A[minIndex]+" and "+A[minIndex]+" is a temp of "+month[minIndex]+".");
	}
	
	public static int maxPosTemp(int[] arr) {
		int max = 0,maxIndex = 0;
		for (int i = 0;i < arr.length; i++) {
			if(arr[i] > max) 
			{
				max = arr[i];
				maxIndex = i;
			}	
		}
		return maxIndex;
	}

	public static int minPosTemp(int[] arr) {
		int min = 0,minIndex = 0;
		for (int i = 0;i < arr.length; i++) {
			if(arr[i] < min) 
			{	
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
}
