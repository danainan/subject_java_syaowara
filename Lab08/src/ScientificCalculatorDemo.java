
import java.util.Scanner;
public class ScientificCalculatorDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		ScientificCalculator Sci = new ScientificCalculator();
		
		System.out.println("Welcome to calculator program");
		
		char check = ' ';
		do {
		
		System.out.print("enter x : ");
		int x = sc.nextInt();
		System.out.print("enter y : ");
		int y = sc.nextInt();
		
		Sci.setXY(x,y);
		System.out.print("select operation [+,-,*,/,c,p,m] : ");
		char choice = sc.next().charAt(0);
	
		switch(choice){
			case '+':
				System.out.println("Answer of "+x+" + "+y+" = "+Sci.add());
				break;
			case '-':
				System.out.println("Answer of "+x+" - "+y+" = "+Sci.subtract());
				break;
			case '*':
				System.out.println("Answer of "+x+" * "+y+" = "+Sci.multiply());
				break;
			case '/':
				System.out.println("Answer of "+x+" / "+y+" = "+Sci.divide());
				break;
			case 'p':
				System.out.println("Answer of "+x+" ^ "+y+" = "+Sci.power());
				break;
			case 'm':
				System.out.println("Answer of "+x+" % "+y+" = "+Sci.mod());
				break;
			default:
				Sci.clear();
				break;		
		}
		if(choice != 'c') {
			System.out.print("Do you want to cantinue [y/n] : ");
			check = sc.next().charAt(0);
		}else check = 'y';
		}while(check  == 'y');
		
		System.out.println("Bye Bye !!!");
	}


}