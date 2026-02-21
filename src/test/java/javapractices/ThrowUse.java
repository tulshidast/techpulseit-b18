package javapractices;

public class ThrowUse {

	public static void main(String[] args) {

		MoneyWithdraw moneyWithdraw = new MoneyWithdraw();
		moneyWithdraw.withdraw(3000);

	}

}

class MyException extends NullPointerException {
	public MyException(String msg) {
		super(msg);
	}
}

class MoneyWithdraw {

	public void withdraw(float amountToWithdraw) {
		float accBal = 2000.9f;

		if (amountToWithdraw > accBal) {

			throw new MyException("Please enter withdraw amount less than acc bal");

		}
		accBal = accBal - amountToWithdraw;
		System.out.println("updated acc bal = " + accBal);
	}
}
