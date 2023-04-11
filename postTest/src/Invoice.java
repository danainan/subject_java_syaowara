
public class Invoice implements Payable{
	private int amount;
	
	
	public Invoice(int amount) {
		this.amount = amount ;
	}
	
	public int pay(int amount) {
		
		return amount;
	}

	
	public int getAmount() {
		
		return amount;
	}
	
	public String toString() {
		return "Summary pay amount for Invoice = "+this.amount;
	}
}
