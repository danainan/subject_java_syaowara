import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int secretNumber = (int)(Math.random()*100);
		int guess,score=1;
		System.out.println(secretNumber);
		
		System.out.println("Key in your guess number:");
		guess = input.nextInt();
		while(guess != secretNumber) {
			if (guess <= secretNumber) System.out.println("Try higher");
			else {
				System.out.println("Try lower");
			}
			guess = input.nextInt();
			score++;
		}
		System.out.println("Congratulation! "+secretNumber+" is Secret Number");
		System.out.println("You got it in "+score+" trials!");
	}
}

