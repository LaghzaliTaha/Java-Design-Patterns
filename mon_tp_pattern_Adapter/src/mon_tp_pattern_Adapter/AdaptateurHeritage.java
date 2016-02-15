package mon_tp_pattern_Adapter;

public class AdaptateurHeritage extends AdapteeNeed implements Standard {

	@Override
	public void operation(int nb1, int nb2) {
		int nb=operation2(nb1, nb2);
		operation3(nb);
	}
	
	

}
