package brushup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		Integer[] num = { 1, 2, 3, 3, 4, 4, 5, 6, 7, 7, 3 };
	//	Arrays.sort(num);

		Set<Integer> a1 = new HashSet<Integer>();

		for (int i = 0; i < num.length; i++) {
			
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] == num[j]) {

					a1.add(num[i]);
				}

			}
			

		}
	
			System.out.println("duplicate" + a1);
		

	}

}


