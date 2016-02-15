package dp;

public class FactoryImplA implements AbstractFactory {

	public AbstractPlugin getInstance() {
		
		return new PluginImplA() ;
	}

}
