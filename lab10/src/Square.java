
public class Square extends Shape{
	private int width;
	
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
	
	public void resize(int percent) {
		this.width = this.width * percent/100;
	}
	@Override
	public int compareTo(Object object) {
		
		if(this.getArea() > ((Square)object).getArea()){
			return 1;
		}
		else if(this.getArea() < ((Square)object).getArea()) { 
			return -1;
		}else {
			return 0;
		}
	}
}
