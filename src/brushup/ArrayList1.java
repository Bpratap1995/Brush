package brushup;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Bhanu");
		a.add("golu");
		a.add("Selenium");
		System.out.println(a);
		
		System.out.println(a.contains("Bhanu"));
		a.remove(0);
		System.out.println(a);
		System.out.println(a.get(1));
		

	}

}
