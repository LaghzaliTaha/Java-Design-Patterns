package mon_tp_pattern_Adapter;

public class Test {

	public static void main(String[] args) {
		
		Standard st=new StandardImpl();
		st.operation(6, 4);
		
//		AdapteeNeed need=new AdapteeNeed();
//		need.operation3(need.operation2(6, 4));
		
		Standard sd=new Adaptateur();
		sd.operation(6, 4);
		
		Standard heritage= new AdaptateurHeritage();
		heritage.operation(6, 4);
	}

}
