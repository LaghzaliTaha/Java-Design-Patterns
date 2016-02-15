package mon_tp_pattern_Singleton;

public class Test {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
		Singleton singlet=Singleton.getInstance();
		singlet.traiter("T"+i);
		}
	}
}
