package SimpleQuestions;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Value of Base: ");
		double a = sc.nextDouble();
		

		System.out.print("Value of Height: ");
		double b = sc.nextDouble();
		
		double area = 0.5 *  a * b ;
		
		System.out.println("Area Of Triangle: " +area);
	}

}
