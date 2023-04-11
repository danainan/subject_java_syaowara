
public class BankAccount {
	private String accountNo;
	private int balance =0;
	private String name;
	private Card card;
	
	public BankAccount(String no, int balance, String name) {
		this.accountNo = no;
		this.balance = balance;
		this.name = name;
	}
	public void deposit(int amount) {
		this.balance+=amount;
	}
	public boolean withdraw(int amount) {
		if(amount > balance) return false;
		else {
			this.balance -= amount;
			return true;
		}
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card c) {
		this.card = c;
	}
	public String toString() {
        return "Account No. " + this.accountNo + " Name: " + this.name + " and Blance: " + this.balance;
    }
}
