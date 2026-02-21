package differentpkg;

//import javapractices.C1;
//import javapractices.C3;

import javapractices.*;

public class C2 {

	public static void main(String args[]) {
		C1 c1 = new C1();
		c1.testPgkC1();
		new C3().testPgkC3();

		javapractices.C4 c4 = new javapractices.C4();
	}

	public void testPgkC2() {
		System.out.println("Method from java different pkg");

	}

}
