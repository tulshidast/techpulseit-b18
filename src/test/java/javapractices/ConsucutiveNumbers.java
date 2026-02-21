package javapractices;

import java.util.Arrays;
import java.util.List;

public class ConsucutiveNumbers {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 10, 23, 9, 22, 34, 100, 3, 4, 10);

		for (int i = 0; i < l.size(); i++) {
			if (i == l.size() - 1)
				break;

			if (l.get(i) + 1 == (l.get(i + 1))) {

				System.out.print(l.get(i) + "\t");

			}

			if (l.get(i) == (l.get(i - 1) - 1)) {
				System.out.print(l.get(i) + "\t");
			}
		}

	}

}
