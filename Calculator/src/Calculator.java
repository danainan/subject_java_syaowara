import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char op,check ='y';
		double num;
		
		System.out.println("Calculator operation [a,s,f,c]");
		
		do {
			System.out.print("Enter operator: ");
			op = sc.next().charAt(0);
			System.out.print("Enter number: ");
			num = sc.nextDouble();
			
			switch (op) {
				case 'a' :
					System.out.print("Answer of absolute is "+ (int)Math.abs(num)+"\n");
					break;
				case 's' :
					if(num > 0){
						System.out.print("Answer of square is "+ Math.sqrt(num)+"\n");
					}
					else {
						System.out.print("Cannot process the square root of a negative number. \n");
					};
					break;
				case 'f' :
					System.out.print("Answer of floor method is "+ (int)Math.floor(num)+"\n");
					break;
				default :
					System.out.print("Answer of ceil method is "+ (int)Math.ceil(num)+"\n");
			}
			System.out.print("Do you want to continue [y/n] : ");
			check = sc.next().charAt(0);
		}while(check == 'y');
		System.out.print("Bye Bye !!");
	}
}
