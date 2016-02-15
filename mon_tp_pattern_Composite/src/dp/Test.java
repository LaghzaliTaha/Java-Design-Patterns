package dp;

public class Test {

	public static void main(String[] args) {
		
		Composite racine=new Composite("Composite1");
		Composite c2=new Composite("Composite2");
		racine.ajouter(c2);
		Composite c22=new Composite("Composite22");
		racine.ajouter(c22);
		c2.ajouter(new Element("Element0"));
		
		c22.ajouter(new Element("Element1"));
		//new Composite("Composite2").ajouter();
		racine.ajouter(new Composite("Composite3"));
		racine.operation();
		
	}
}
