package javapractices;

public class AbstractionUsingAbstractClass {

	public static void main(String[] args) {

		Abs abs = new ImplOfAbs();
		System.out.println(abs.payment(200));

	}

}

abstract class Abs {

	public Abs(int a, int b) {
		System.out.println("From parent class constructor = " + (a + b));
	}

	public void add() {
		System.out.println("Non abstract method");
	}

	/**
	 * This method is used to make payment.
	 * 
	 * @param amount We have to pass amount as parameter.
	 * 
	 * @return int It will return payment amount
	 * 
	 */
	public abstract int payment(int amount);
}
