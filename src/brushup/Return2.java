package brushup;

public class Return2 {
	public void abc() {
		Return1 r = new Return1();
		int a=r.Return2();
		int b=r.n();
		int c= a+b;
		System.out.println("...a.."+a);
		System.out.println("...b<<<.."+b);
		System.out.println("...c>>>.."+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Return2 r = new Return2();
	 r.abc();
	
	 
		
	}

}
