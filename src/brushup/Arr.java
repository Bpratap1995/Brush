package brushup;



public abstract  class Arr {
	
	
	public void copy() {
		System.out.println("pen");
		
	}
	public abstract void tip();
	

	public static void main(String[] args) {
		 String s="My name is bhanu";
	  String s1 = s.replace("is","are");
	     System.out.println(s1);
 String [] Name = {"bhanu","selenium","rahul","Neelima"};
 System.out.println(Name.length);
 String n="";
 
 for (int i=0;i<=Name.length-1;i++) {
	 System.out.println(Name[i]);
	 n=n+Name[i].charAt(0);
	 System.out.println(n);
	
	 
 }
 
 
 

 
   
 
  
   

	}

}
