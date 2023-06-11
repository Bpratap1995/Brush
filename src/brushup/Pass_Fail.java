package brushup;

import java.util.Scanner;

public class Pass_Fail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int marks_obtained=scan.nextInt();
		int pass_marks =scan.nextInt();
		if(marks_obtained>=pass_marks)
			System.out.println(" >>>>>>>>>>>>>>>");
			if(marks_obtained>=90)
				System.out.println("grade A");
	
			else if (marks_obtained>=80)
				System.out.println("grade B");
			else if (marks_obtained>=70)
				System.out.println("grade C");

	}

}
