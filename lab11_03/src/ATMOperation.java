import java.util.Scanner;

public class ATMOperation {
	public static void main(String[] args) {
		char select, choice = 'y';
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to ATM Program");
		
		Student std = new Student("AAA", "60100000","SWE");
		Card card = new Card("5648",'D',"1234");
		BankAccount bankAccount = new BankAccount("828 4561 256",5000,"AAA");
		bankAccount.setCard(card);
		std.setCard(card);
		System.out.println("Student, Card and Bank info");
		System.out.println(std.toString());
		System.out.println(card.toString());
		System.out.println(bankAccount.toString());
		System.out.println("================================");
		
		System.out.println("Please enter card no and pin:");
		if(!(card.isValid(input.next(), input.next()))) {
			System.out.println("Invalid card");
			System.out.println("Bye Bye !!!");
		}else {
			do {
				System.out.println(bankAccount.toString());
				System.out.print("Please select menu [D/W]:");
				select = input.next().charAt(0);
				System.out.print("Amount: ");
				switch(select) {
				case 'W':
					if(!(bankAccount.withdraw(input.nextInt()))) {
						System.out.println("Cannot withdrawn");
					}break;
				case 'D':
					bankAccount.deposit(input.nextInt());
				}
				System.out.println(bankAccount.toString());
                System.out.print("Do you want to continue [y/n]: ");
                choice = input.next().charAt(0);

			}while(choice == 'y');
			System.out.println("Bye Bye !!");
		}
	}
}
