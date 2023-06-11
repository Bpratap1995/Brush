package brushup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumber {

	public static void main(String[] args) {
		Integer[]num = {1,2,3,3,4,4,5,6,7,7};
		List<Integer>num2=Arrays.asList(num);
		Set<Integer> n1=new HashSet<Integer>(num2);
		for(int result:n1) {
			System.out.println(result);
		}

	

}
}
