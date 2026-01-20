package SimpleQuestions;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Principal Amount: ");
		int principal=sc.nextInt();
		

		System.out.print("Enter The Rate of Interest: ");
		int Rate =sc.nextInt();
		

		System.out.print("Enter The Time Period (In Years): ");
		int time =sc.nextInt();

		int i= principal * Rate * time / 100;
		
		System.out.println("Simple Interest: " +i);
	}

}
