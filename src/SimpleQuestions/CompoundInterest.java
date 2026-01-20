package SimpleQuestions;

import java.util.Scanner;

public class CompoundInterest {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principal Amount: ");
		double p=sc.nextDouble();
		
		System.out.println("Enter the Rate Of Interest: ");
		float r=sc.nextFloat();
		
		System.out.println("Enter The Time: ");
		double t = sc.nextDouble();
		
		
		double c = p * Math.pow(( 1 + r / 100 ),t);
		
		System.out.println("Compound Interest: " +c);
		
	}

}
