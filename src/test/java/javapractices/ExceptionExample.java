package javapractices;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {

		ExceptionExample exceptionExample = new ExceptionExample();

		System.out.println("Before execution of code");

		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		scanner.close();

		int div = exceptionExample.div(n1, n2);

		System.out.println(div);

		System.out.println("After execution of code");

	}

	public int div(int a, int b) {
		return a / b;
	}

}
