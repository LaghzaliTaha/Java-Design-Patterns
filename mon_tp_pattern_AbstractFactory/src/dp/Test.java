package dp;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//Instanciation statique
		
		AbstractFactory factory = new FactoryImplA() ;
		AbstractPlugin plug= factory.getInstance();
		plug.traitement();
		
		AbstractFactory factoryB = new FactoryImplB() ;
		factoryB.getInstance().traitement();
		
		//Instanciation dynamique
			factory =(AbstractFactory) Class.forName("dp.FactoryImplB").newInstance();
			plug=factory.getInstance();
			plug.traitement();
	}
}
