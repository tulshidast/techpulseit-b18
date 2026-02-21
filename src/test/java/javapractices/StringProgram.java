package javapractices;

public class StringProgram {

	public static void main(String[] args) {

		String s = "123Rgrrf%^$^23fvkjj";

		// 12323= 11

		String s2 = s.replaceAll("[^0-9]", "");

		int sum = 0;

		for (int i = 0; i < s2.length(); i++) {

			// int num1 = Integer.parseInt(String.valueOf(s2.charAt(i)));

			int num1 = Character.getNumericValue(s2.charAt(i));

			sum = sum + num1;
		}

		System.out.println(sum);

	}

}
