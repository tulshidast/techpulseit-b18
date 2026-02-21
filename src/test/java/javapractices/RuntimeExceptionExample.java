package javapractices;

public class RuntimeExceptionExample {

	public static void main(String[] args) {

		RunException runException = new RunException();

		runException.testArithmatic(100, 0);

		// runException.testArithmatic(100, 20);

		// runException.testNumberFormatException("123.3");
		runException.testNumberFormatException("123");

		// runException.testNullPointerException(null);

		runException.testNullPointerException("test");

		// runException.testStringIndexOutOfBounds("Welcome", 8);
		runException.testStringIndexOutOfBounds("Welcome", 6);

		String arr[] = { "sachin", "virat", "hardik", "rahul" };

		// runException.testArrayIndexOutOfBounds(arr, 4);

		runException.testArrayIndexOutOfBounds(arr, 3);

	}

}

class RunException {

	public void testArithmatic(int a, int b) {

		try {
			System.out.println(a / b);
		}

		catch (ArithmeticException e) {
			System.out.println("Please do not try to devide by 0");
		}

		catch (Exception e) {

		}

		System.out.println("After getting an exception as well");
	}

	public void testNumberFormatException(String price) {

		int p = Integer.parseInt(price);
		System.out.println(p + 10);
	}

	public void testNullPointerException(String price) {

		System.out.println(price.length());
	}

	public void testStringIndexOutOfBounds(String price, int index) {

		System.out.println(price.charAt(index));
	}

	public void testArrayIndexOutOfBounds(String price[], int index) {

		System.out.println(price[index]);
	}
}
