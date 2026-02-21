package javapractices;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.addition(10.5f, 10);

		Child child = new Child();
		child.addition();

		child.addition(10.3f, 10.6f, 20);

	}

	public void addition() {
		System.out.println(10 + 20);

	}

	public void addition(int a) {

		System.out.println(a + 10);
	}

	public void addition(int a, int b) {

		System.out.println(a + b);
	}

	public void addition(float a, int b) {

		System.out.println(a + b);
	}

	public void addition(float a, float b) {

		System.out.println(a + b);
	}

}

class Child extends MethodOverloading {

	public void addition(float a, float b, int c) {

		System.out.println(a + b + c);
	}

}
