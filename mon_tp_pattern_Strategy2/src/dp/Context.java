package dp;

public class Context {
	
	Strategy strat;
	
	public void setStrategy(Strategy s) {
		this.strat=s;
	}
	
	public void effectuerStrategy() {
		strat.operationStrategy();;	
	}
	
	
}
