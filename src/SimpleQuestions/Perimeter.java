package SimpleQuestions;

import java.util.Scanner;

public class Perimeter {
	
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the values of Recantagle: ");
			
			System.out.print("Enter The Value Of A: ");
			int a=sc.nextInt();
			
			System.out.print("Enter The Value Of B: ");
			int b=sc.nextInt();
			
			System.out.print("Enter The Value Of C: ");
			int c=sc.nextInt();
			
			System.out.print("Enter The Value Of D: ");
			int d=sc.nextInt();
			
			System.out.println("Recevied Value: " +a +b +c +d);
			
			int primeter = a + b + c + d;
			System.out.println("Perimeter of Recantangle: " +primeter);
		}
	}

}
