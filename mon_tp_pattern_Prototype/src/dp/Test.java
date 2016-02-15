package dp;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Figure f1=new Cercle(new Point(10, 10), new Point(20, 20));
		Figure f2=new Rectangle(new Point(30, 30), new Point(40, 40));
		
		System.out.println("Surface de "+f1+"est :"+f1.getSurface());
		System.out.println("Surface de "+f2+"est :"+f2.getSurface());
		System.out.println("----------------------------");
		
		//l'avantage de ce clonage: il ne sait pas si f1 est Cercle ou rectangle;
		System.out.println("copie de f1");
		Figure f3=f1.clone();
		System.out.println("Surface de "+f3+"est :"+f3.getSurface());
		System.out.println("----------------------------");
		
		System.out.println("copie de f12");
		Figure f4=f2.clone();
		System.out.println("Surface de "+f4+"est :"+f4.getSurface());
		System.out.println("----------------------------");
		
		f1.p1.x=60;
		System.out.println(f1);
		System.out.println(f3);
	}
}
