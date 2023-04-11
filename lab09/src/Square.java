
public class Square extends Shape {
	protected int width;
	
	public Square(String c,int w) {
		super.setColor(c);
		this.width = w;
	}
	public double getArea() {
		return width*width;
	}
	
	public int getParimeter() {
		return 4*width;
	}
	
	public String toString() {
		return super.toString()+" width:"+this.width;
	}
	
}
