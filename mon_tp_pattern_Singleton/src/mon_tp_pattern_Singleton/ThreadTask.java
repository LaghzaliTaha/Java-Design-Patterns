package mon_tp_pattern_Singleton;

public class ThreadTask extends Thread {
	
	private String name;
	
	public ThreadTask(String n)
	{
		this.name=n;
	}
	
		public void run() {
			Singleton sing=Singleton.getInstance();
			sing.traiter(name);	
		}
}
