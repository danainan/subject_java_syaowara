import java.util.Scanner;

public class TestPayable {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter no of Invoice: ");
		int iv = input.nextInt();
		int[] miv = new int[iv];
		System.out.print("Enter no of Salary: ");
		int sr = input.nextInt();
		int[] msr = new int[sr];
		
		for(int i =0;i < iv;i++) {
			System.out.print("Enter money Invoice No. "+(i+1)+" :");
			miv[i] = input.nextInt();
		}
		for(int j =0;j < sr;j++) {
			System.out.print("Enter money Salary No. "+(j+1)+" :");
			msr[j] = input.nextInt();
		}
		
		
	}

	public static void Salary(int[] msr) {
		
	}

	
}
