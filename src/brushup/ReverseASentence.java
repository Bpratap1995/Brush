package brushup;

public class ReverseASentence {

	public static void main(String[] args) {

		String st="bhanu is my name";
		String [] st1= st.split(" ");
		int sizeOfArray = st1.length;
		for(int i =sizeOfArray-1;i>=0;i--) {
			System.out.println(st1[i]);
			if(st1[i]==st1[0]) {
				int size = st1[i].length();
				for(int j =0;j<size;j++) {
					System.out.println(st1[i].charAt(j));
				}
			}
		}
		

	}

}
