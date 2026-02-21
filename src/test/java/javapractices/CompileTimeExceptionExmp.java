package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExceptionExmp {

	public static void main(String[] args) throws FileNotFoundException {

		TestCompileException testCompileException = new TestCompileException();
		testCompileException.test();

	}

}

class TestCompileException {

	public void test() throws FileNotFoundException {
		File file = new File("C:/test/test.txt");

		FileInputStream fileInputStream = new FileInputStream(file);

	}

}
