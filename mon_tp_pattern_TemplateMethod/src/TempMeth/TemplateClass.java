package TempMeth;

public abstract class TemplateClass {
	
	public int operationTemplate() {
		int a=operationAbs1();
		int somme=0;
		
		for (int i = 0; i < a; i++) {
			somme+=operationAbs2();
		}
		return somme;
	}
	protected abstract int operationAbs1();
	protected abstract int operationAbs2();
}