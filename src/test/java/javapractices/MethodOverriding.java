package javapractices;

public class MethodOverriding {

	public static void main(String[] args) {

		Child1 child1 = new Child1();

		MethodOverriding methodOverriding = new Child1();

		methodOverriding.testing(2, 3);

	}

	public void testing(int a, int b) {

		System.out.println(a + b);

	}

	public void mul() {
		System.out.println(10 * 10);
	}

}

class Child1 extends MethodOverriding {

	public void testing(int a, int b) {

		System.out.println(a + b + a * b);

	}

}
