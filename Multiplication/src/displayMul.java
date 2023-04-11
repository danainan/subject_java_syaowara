import java.util.Scanner;

public class displayMul {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char check = 'y';
		int number;
		
		while(check == 'y') {
			System.out.print("Number [2 to 12] : ");
			number = input.nextInt();
			while (number < 2 || number > 12) {
				System.out.println("Invalid data, please try agian.");
				System.out.print("Number [2 to 12] : ");
				number = input.nextInt();
			}
			displayMul(number);
			System.out.print("Do you want to continue [y/n]: ");
			check = input.next().charAt(0);
		}
		System.out.print("Bye Bye !!");
		}
	public static void displayMul(int n) {
		for(int i = 1;i<=12;i++) {
			System.out.println(n+" x"+i+" ="+n*i);
		}
	}
}
