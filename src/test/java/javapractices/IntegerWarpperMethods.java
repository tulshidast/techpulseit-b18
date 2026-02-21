package javapractices;

public class IntegerWarpperMethods {

	public static void main(String[] args) {

		Integer i = 12345;

		System.out.println(i instanceof Integer);

		// un boxing

		int a = i.intValue();

		// boxing / auto boxing
		Integer i2 = Integer.valueOf(a);

		Character ch = 'c';

		char c1 = ch.charValue();

		Character c2 = Character.valueOf(c1);

	}

}
