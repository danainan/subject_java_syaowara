import java.util.Scanner;

public class DigitOrChar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter integer : ");
		int num = sc.nextInt();
		
		if (num >= 10 && num <= 35) {
			num = num + 55;
			char c =(char)(num);
			System.out.print("Character " +c);
		}else if (num >= 0 && num <= 9){
			System.out.print("Digit " +num);
		}else if (num < 0 || num > 35) {
			System.out.print("Invalid number");
		}
	}
}
