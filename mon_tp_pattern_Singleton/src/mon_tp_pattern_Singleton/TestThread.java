package mon_tp_pattern_Singleton;

public class TestThread {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
		ThreadTask t=new ThreadTask("T"+i);
		t.start();
		}
	}
}
