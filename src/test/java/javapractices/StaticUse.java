package javapractices;

public class StaticUse {

	public static void main(String[] args) {

		StaticU2 staticU2 = new StaticU2();
		staticU2.test();
		System.out.println(staticU2.a);
		StaticU2.testing();
		System.out.println(StaticU2.b);

		StaticU2 staticU3 = new StaticU2();
		staticU3.test();

	}

}

class StaticU2 {

	// instance member variable
	int a = 10;

	// static member variable
	static int b = 10;

	// instance member function
	public void test() {
		System.out.println(b);
		testing();
		System.out.println("Instance memeber variable");
	}

	// static member function
	public static void testing() {
		System.out.println("static memeber function ");
	}

}
