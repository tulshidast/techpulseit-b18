package javapractices;

public class ImplClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ImplOfAbs extends Abs {

	public ImplOfAbs() {
		super(10, 20);
		System.out.println("From child class constructor");
	}

	@Override
	public int payment(int amount) {
		int accBal = 1000;
		accBal = accBal - amount;
		return accBal;
	}

}
