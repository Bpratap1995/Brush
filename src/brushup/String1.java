package brushup;

public class String1 {

	public static void main(String[] args) {
		String st = "My name is bhanu";
		String[] result = st.split(" ");
		int size= result.length;
		System.out.println(size);
		for(int i =0;i<size;i++) {
			System.out.println(result[i]);
		}
		for(int j=size-1;j>0;j--) {
			System.out.println(result[j]);
		}
		
		

	}

}
