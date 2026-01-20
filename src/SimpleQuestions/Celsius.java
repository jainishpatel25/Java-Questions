package SimpleQuestions;

import java.util.Scanner;

public class Celsius {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of Fahrenheit: ");
		float f=sc.nextFloat();
		
		float celsuis = ( f - 32) * 5.0f / 9.0f ;
		
		System.out.println("Fahrenheit to Celsius: " +celsuis+"*");
	
	}

}
