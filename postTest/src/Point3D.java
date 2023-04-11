
public class Point3D  extends Point {
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	public int getZ() {
		return this.z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public String toString() {
		return "("+super.getX()+","+super.getY()+","+this.z+")";
	}
}
