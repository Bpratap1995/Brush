package brushup;

import java.util.Arrays;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer [] arr= {1,2,3,3,4,5,3,5,5};
int size=arr.length;
Arrays.sort(arr);
for(int i=0;i<size-1;i++) {
	for(int j=i+1;j<size;j++) {
		if(arr[i]==arr[j]) {
			System.out.println(arr[i]);
		}
	}
}
  

	}

}
