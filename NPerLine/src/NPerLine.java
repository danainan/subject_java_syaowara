import java.util.Scanner;

public class NPerLine {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n1: ");
		int n1 = input.nextInt();
		System.out.print("Enter n2: ");
		int n2 = input.nextInt();
		System.out.print("Enter col: ");
		int col = input.nextInt();
		
		for (int i = n1 ; i <= n2;) {
			for (int j = 1; j <= col && i <= n2;j++) {
				System.out.print(i+"\t");
				i++;
			}
			System.out.print("\n");
		}
	
	}	
}
