package mon_tp_pattern_Singleton;

public class Singleton {
	
	private static final Singleton instance;
	private int compteur;
	
	private Singleton() {
		System.out.println("instanciation");
	}
	
	static { instance=new Singleton();}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public synchronized void traiter(String tache) {
		System.out.println("----------Tache"+tache+"---------");
		for(int i=1;i <= 5;i++)
		{
			++compteur; System.out.print("."+compteur);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		System.out.println(" ");
		System.out.println("Compteur="+compteur);
	}
}
