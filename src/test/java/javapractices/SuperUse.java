package javapractices;

public class SuperUse {

	public static void main(String[] args) {

		ChildOfSuperUsage child = new ChildOfSuperUsage(5);
		child.testAdd();
		child.testSub();

	}

}

class SuperUsage {

	SuperUsage(int a1) {

		System.out.println(a1 * a1);

	}

	// instance member variables
	int a = 20;
	int b = 10;

	// instance member functions
	public void testAdd() {
		System.out.println("Addition from parent = " + (a + b));
	}

}

class ChildOfSuperUsage extends SuperUsage {

	ChildOfSuperUsage(int a1) {
		super(a1);
	}

	// instance member variables
	int c = 30;
	int a = 40;

	// instance member functions
	public void testSub() {
		System.out.println("Substraction from child = " + (c + super.a));
	}

}
