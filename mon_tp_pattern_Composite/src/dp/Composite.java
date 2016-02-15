package dp;

import java.util.ArrayList;

public class Composite extends Composant {
	
	ArrayList<Composant> composants=new ArrayList<Composant>();
	
	public Composite(String nom) {
		super(nom);
	}

	@Override
	public void operation() {
		String tab="";
		for (int i = 1; i <= niveau; i++)
		 {		tab+="----";
		 }
		    System.out.println(tab+"Composite :"+nom); 
		    for (Composant c:composants) {
			    c.operation();
	      }
	}
	
	public void ajouter(Composant c) {
        c.niveau=this.niveau+1;
		composants.add(c);
	}
	
	public void supprimer(Composant c) {
		composants.remove(c);
	}
}
