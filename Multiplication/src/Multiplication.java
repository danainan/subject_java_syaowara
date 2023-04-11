import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char check = 'y';
		int number;
		
		while (check == 'y') {
			System.out.print("Number [2 to 12] : ");
			number = input.nextInt();
			
			while (number < 2 || number > 12) {
				System.out.println("Invalid data, please try agian.");
				System.out.print("Number [2 to 12] : ");
				number = input.nextInt();
			}
				for(int i = 1;i<=12;i++) {
					System.out.println(number+" x"+i+" ="+number*i);
				}
				System.out.print("Do you want to continue [y/n]: ");
				check = input.next().charAt(0);
			}
			System.out.print("Bye Bye !!");
	}
}
