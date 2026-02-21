package javapractices;

public class ImplOfInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ImplOFInterfaceExample implements MyInter {

	int b = 30;

	@Override
	public void test() {
		System.out.println(MyInterface.a);
		System.out.println("This is method from interface");

	}

	@Override
	public void test1() {

		System.out.println("This is second method from interface");

	}

	public void testing() {
		System.out.println("Implementation class own method");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub

	}

}

class MultipleInheritance implements MyInter2, MyInterface2 {

	@Override
	public void test3() {
		System.out.println("Common implementation");
	}

}
