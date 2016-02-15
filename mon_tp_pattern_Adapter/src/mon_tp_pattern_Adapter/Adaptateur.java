package mon_tp_pattern_Adapter;

public class Adaptateur implements Standard {

	private AdapteeNeed ad=new AdapteeNeed();
	
	public void operation(int nb1, int nb2) {
		int nb=ad.operation2(nb1, nb2);
		ad.operation3(nb);
	}

}