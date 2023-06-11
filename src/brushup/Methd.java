package brushup;

import java.util.Arrays;
import java.util.List;

public class Methd {
	static int i =5;
	
	public static int pen() {
		System.out.println("used to write");
		return i;
	}

	public static void main(String[] args) {
	
		int a = pen();
		//int num = i;
		System.out.println(a);
		
		
		int [] num1 = {1,2,3,4,5,6};
		List<int[]> number = Arrays.asList(num1);
		boolean result = number.contains(3);
		System.out.println(result);
		

	}

}
