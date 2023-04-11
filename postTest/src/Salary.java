
public class Salary implements Payable {
	private int amount;
	
	public Salary(int amount) {
		this.amount = amount;
	}
	
	public int pay(int amount) {
		int a = this.amount+amount;	
		return a;
	}

	
	public int getAmount() {
	
		return amount;
	}
	
	public String toString() {
		return "Summary pa amount for Salary = "+this.getAmount();
	}

	
}
