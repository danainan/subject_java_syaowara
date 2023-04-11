import java.util.Scanner;
public class TestCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator Cal = new Calculator();
		System.out.println("Welcome to calculator program");
		
		char check = ' ';
		do {
		
		System.out.print("enter x : ");
		int x = sc.nextInt();
		System.out.print("enter y : ");
		int y = sc.nextInt();
		
		Cal.setXY(x,y);
		System.out.print("select operation [+,-,*,/,c,p,m] : ");
		char choice = sc.next().charAt(0);
	
		
		switch(choice){
			case '+':
				System.out.println("Answer of "+x+" + "+y+" = "+Cal.add());
				break;
			case '-':
				System.out.println("Answer of "+x+" - "+y+" = "+Cal.subtract());
				break;
			case '*':
				System.out.println("Answer of "+x+" * "+y+" = "+Cal.multiply());
				break;
			case '/':
				System.out.println("Answer of "+x+" / "+y+" = "+Cal.divide());
				break;
			default:
				Cal.clear();
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
