package javapractices;

import java.util.ArrayList;

public class CharacterCountByArray {

	public static void main(String[] args) {

		String s = "Welcome to codedisha";

		ArrayList<Character> alist = new ArrayList<Character>();

		char arr[] = s.toCharArray();

		int count = 1;

		for (int i = 0; i < arr.length; i++) {

			if (alist.contains(arr[i]))
				continue;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			System.out.println(arr[i] + " : " + count);

			count = 1;

			alist.add(arr[i]);

		}

	}

}
