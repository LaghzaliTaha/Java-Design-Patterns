package state;

public class Test {

	public static void main(String[] args) {
		
		Avion av=new Avion();
		av.doAction();
		
		av.entrerDsGarage();
		av.sortirDuGarage();
		av.doAction();
		
		av.atterir();
		
		av.decoller();
		av.doAction();
		av.entrerDsGarage();
		av.sortirDuGarage();
		av.atterir();
	}

}
