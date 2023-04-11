
public class ScientificCalculator extends Calculator{
	ScientificCalculator(){

	}
	public int power() {
		int power =  (int)Math.pow(super.x, super.y);
		return power;
	}
	public int mod() {
		int mod = super.x % super.y;
		return mod;
	}
}
