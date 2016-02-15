package mon_tp_pattern_Proxy;

public class Proxy implements Abstraction{

	private Implementation impl;
	
	public void operation() {
		
		System.out.println("Verfication des conditiond d'acces par le proxy");
		impl=new Implementation();
		impl.operation();
		
	}

}
