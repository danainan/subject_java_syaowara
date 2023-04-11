
public class Point2D implements Movable{
	private int x;
	private int y;
	public Point2D(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void moveUp(int y) {
		this.y = this.y+y;
		
	}
	public void moveDown(int y) {
		this.y = this.y-y;
		
	}
	public void moveLeft(int x) {
		this.x = this.x-x;
	}
	public void moveRight(int x) {
		this.x = this.x+x;
		
	}
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
}


