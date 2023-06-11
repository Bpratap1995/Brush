package brushup;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter the three number");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c=scan.nextInt();
	
	if(a>b && a>c) {
		System.out.println(a+"first number is largest");
		
		
	}else if(b>a && b>c){
		System.out.println(b+"second number is largest");
		
	}else if (c>a && c>b) {
		System.out.println(c+"third number ius largest");
	}else {
		System.out.println("default");
	}
		

	}

}
