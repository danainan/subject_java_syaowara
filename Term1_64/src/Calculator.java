
public class Calculator {
	public int x ;
	public int y ;

	
	public Calculator () {
		
	}
	
	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void clear() {
		setXY(0, 0);
	}
	
	public int add() {
		int add = this.x+this.y;
		return add;
	}
	
	public int subtract() {
		int sub = this.x-this.y;
		return sub;
	}
	
	public double divide() {
		double div = this.x/this.y;
		return div;
	}
	
	public int multiply() {
		int mul = this.x*this.y;
		return mul;
	}

}
