package brushup;

public class SubString {

	public static void main(String[] args) {
	
	

	
	String name ="bhanu ";
	int size = name.length();

	for(int i=0;i<size;i++) {
		for(int j=1;j<=size-i;j++) {
			String substring = name.substring(i, j+i);
			System.out.println(substring);
			
		}
		
	}
	}

}
