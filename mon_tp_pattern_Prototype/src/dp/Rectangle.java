package dp;

public class Rectangle extends Figure {
	
	public Rectangle(Point p1, Point p2) {
		super(p1, p2);
			}

	
	public double getSurface() {
		int l=p1.x-p2.x;
		int h=p1.y-p2.y;
		return l*h;
	}
	
	@Override
	public String toString() {
		return "Rectangle["+super.toString()+"]";
	}
}
