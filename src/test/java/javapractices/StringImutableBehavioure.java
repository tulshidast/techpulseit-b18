package javapractices;

public class StringImutableBehavioure {

	public static void main(String[] args) {

		String s = "sachin";

		System.out.println(s);

		String ss = s.concat(" tendulkar");

		System.out.println(s);

		System.out.println(ss);

		System.out.println(s.hashCode());

		System.out.println(ss.hashCode());

		String s2 = "sachin";

		System.out.println(s.hashCode() + " : " + s2.hashCode());

	}

}
