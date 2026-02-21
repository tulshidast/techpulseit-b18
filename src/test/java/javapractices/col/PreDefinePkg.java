package javapractices.col;

import java.util.ArrayList;

public class PreDefinePkg {

	public static void main(String[] args) {
		
		new PreDefinePkg().calcSqrt(81);

	}

	public void calcSqrt(int num) {
		System.out.println(Math.sqrt(num));
		ArrayList<Integer> rollNumber = new ArrayList<Integer>();
		rollNumber.add(10);
		rollNumber.add(20);
	}

}
