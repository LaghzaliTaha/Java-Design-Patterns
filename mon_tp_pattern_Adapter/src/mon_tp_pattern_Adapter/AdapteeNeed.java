package mon_tp_pattern_Adapter;

public class AdapteeNeed {
	
	public int operation2(int n1,int n2) {
		return n1*n2;
		
	}
	
	public void operation3(int nb) {
		
		System.out.println("Adaptee,Resultat="+nb);
	}

}
