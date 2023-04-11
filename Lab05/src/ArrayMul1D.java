import java.util.Scanner;

public class ArrayMul1D {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[10];
		System.out.print("A :");
		for(int i = 0;i < A.length;i++) {
			A[i] = input.nextInt();
		}
		int[] B = new int[10];
		System.out.print("B :");
		for(int i = 0;i < B.length;i++) {
			B[i] = input.nextInt();
		}
		int[] C = mulArray(A,B);
		printArray(C);
	}
	public static void printArray(int[] arr) 
	{
		int sum = 0;
		System.out.print("C :");
		for(int i = 0;i < arr.length;i++) {
			sum+=arr[i];
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
		System.out.print("Sum of Array C = ");
		for(int i = 0;i < arr.length;i++) {
			System.out.print(+arr[i]);
			if(i < arr.length-1)
				System.out.print("+");
		}
		System.out.print(" = "+sum);
	}
	
	public static int[] mulArray(int[] arr1, int[] arr2) 
	{
		int[] C = new int[10];
		int i ,j = 9;
		for(i = 0;i < C.length;i++) {
			C[i] = arr1[i] * arr2[j];
			j--;
		}
		return C;
	}
}

