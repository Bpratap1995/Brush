package brushup;

import java.util.Arrays;

public class Du {

	public static void main(String[] args) {
		Integer[]num= {1,2,3,4,3,2,3};
		int size = num.length;
		 Arrays.sort(num);
		for(int i=0;i<size;i++) {
			System.out.print(" "+ num[i]);
			
		}
		
		
		for(int i=0;i<size-1;i++) {
			int count=0;
			for(int j=i+1;j<size;j++) {
				if(num[i]==num[j]) {
					count++;
					
					
					System.out.println(num[i]);
				}
				
				
			}
			System.out.println("======="+count++);
		}

	}

}
