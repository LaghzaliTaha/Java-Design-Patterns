package dp;

public class Point implements Cloneable {
	
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	protected Point clone() throws CloneNotSupportedException {
		
		return (Point) super.clone();
	}
	
	public double distance(Point p) {
		double xx=this.x-p.x;
		double yy=this.y-p.y;
		return Math.sqrt(xx*xx+yy*yy);
	}
	public String toString() {
		return "Point=[x="+x+", y="+y+"]";
	}
}
