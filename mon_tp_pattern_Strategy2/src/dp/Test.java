package dp;

public class Test {

	public static void main(String[] args) {
		
		
		Context cont=new Context();
		cont.setStrategy(new StrategyImpl1());
		cont.effectuerStrategy();
	}

}
