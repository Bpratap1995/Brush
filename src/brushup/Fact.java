package brushup;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int fact =1;
		
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		
		if(num<0)
			System.out.println("no factorial");
		else 
		for(int i =1;i<=num;i++) 
			fact=i*fact;
			System.out.println(fact);
			
		
		

	}

}
