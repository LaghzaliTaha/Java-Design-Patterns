package dp;

public class Cercle extends Figure {

	public Cercle(Point p1, Point p2) {
		super(p1, p2);
		}

	public double getSurface() {
		double r=p1.distance(p2);
		return Math.PI*r*r;
	}

	public String toString() {
		
		return"Cercle["+super.toString()+"]";
	}
}
