package cys.training.day7;

public class ABTestClass {

	public static void main(String[] args) {

		AClass aclass = new AClass();
		aclass.pdisplay();
		BClass bclass = new BClass();
		bclass.cdisplay();
		bclass.pdisplay();
		AClass class1 = new BClass();
		class1.pdisplay();
		// BClass class2=new AClass();//From child class accessing parent class

	}

}
