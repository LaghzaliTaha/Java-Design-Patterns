package TempMeth;

public class Test {

	public static void main(String[] args) {
		TemplateClass tm1=new Implementation1();
		System.out.println(tm1.operationAbs1());
		System.out.println(tm1.operationTemplate());
		
		System.out.println("**************************");
		
		TemplateClass tm2=new Implementation2();
		System.out.println(tm2.operationAbs1());
		System.out.println(tm2.operationTemplate());

	}

}
