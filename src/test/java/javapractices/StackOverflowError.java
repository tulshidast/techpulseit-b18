package javapractices;

public class StackOverflowError {

	public static void main(String[] args) {

		StackOverflowError stackOverflowError = new StackOverflowError();
		stackOverflowError.stk();

	}

	public void stk() {
		System.out.println(1000 + 400);
		stk();
	}

}
