package dp;

public abstract class Composant {
	
	protected String nom;
	protected int niveau;
	
	public Composant(String nom ) {
		this.nom=nom;
	}
	
	public abstract void operation() ;

}
