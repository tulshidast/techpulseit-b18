package javapractices;

public class InterfaceExample {

	int b = 10;
	public static final int c = 20;

	public static void main(String args[]) {
		MyInterface myInterface = new ImplOFInterfaceExample();

		myInterface.test();
		myInterface.test1();

		MultipleInheritance multipleInheritance = new MultipleInheritance();
		multipleInheritance.test3();
	}

}

interface MyInterface {

	public static final int a = 10;
	int d = 3;

	public abstract void test();

	void test1();

}

interface MyInter extends MyInterface {

	public abstract void test3();

}

interface MyInter2 {

	public abstract void test3();

}

interface MyInterface2 {

	public abstract void test3();

}