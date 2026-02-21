package javapractices;

public class ThisUsage {

	public static void main(String[] args) {

		ThisUsage thisUsage = new ThisUsage();
		System.out.println(thisUsage.hashCode());
		thisUsage.add(2, 8);

	}

	// default constructor
	ThisUsage() {
		this(10);
		System.out.println("This is default constructor");
		System.out.println(this.hashCode());

	}

	ThisUsage(int n1) {

		System.out.println("This is parameterized constructor");

	}

	// instance member variable
	int a = 10;
	int b = 20;

	// instance member function
	public void add(int n1, int n2) {
		int b = 40;
		System.out.println("Addition of two numbers: " + (n1 + n2));
		System.out.println(this.b + b);
		this.sub(40, 20);

	}

	public void sub(int n1, int n2) {
		System.out.println("Substraction of two numbers: " + (n1 - n2));

	}

}
