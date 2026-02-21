package javapractices;

public class EncapsulationExample {

	public static void main(String args[]) {
		BeanExample beanExample = new BeanExample();
		beanExample.setA(10);
		beanExample.setB(20);

		System.out.println(beanExample.getA());
		System.out.println(beanExample.getB());
	}

	// Data
	int a;
	int b;

	// code
	public void display() {
		System.out.println(a + " : " + b);
	}

}

class BeanExample {

	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
