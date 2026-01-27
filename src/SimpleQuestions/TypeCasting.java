package SimpleQuestions;

import java.util.Scanner;

public class TypeCasting {

	
	public static void main(String[] args) {
		
//		int  a =10;
//		double b=a;
//		System.out.println(b);

//		double c = 23.21;
//		int l = (int) c;
//		System.out.println(l);
		
		

//		
//		        Scanner sc = new Scanner(System.in);
//
//		        // User enters age as String
//		        System.out.print("Enter your age: ");
//		        String ageInput = sc.nextLine();
//
//		        // Convert String → int (Explicit casting via parsing)
//		        int age = Integer.parseInt(ageInput);
//
//		        // Business logic: check eligibility
//		        if (age >= 18) {
//		            System.out.println("You are eligible to vote!");
//		        } else {
//		            System.out.println("You are not eligible to vote.");
//		        }
//
//		        // Another example: salary calculation
//		        System.out.print("Enter your monthly salary: ");
//		        double salary = sc.nextDouble();
//
//		        // Cast double → int (Narrowing)
//		        int roundedSalary = (int) salary;
//		        System.out.println("Rounded Salary: " + roundedSalary);
//		    
		
//		char c='A';
//		
//		int b = c;
//		
//		System.out.println(b);
		
		byte b = 100;
		byte c = 100;
		byte a =  (byte) (b + c);
		int o =   b + c;
	
		System.out.println(a);
		System.out.println(o);

		double g = 100;
		double y = 100;
	
		double res = g + y;
		System.out.println(res);
	//	System.out.println(a);
		
 //       int num = b + c;   // widening (automatic)
//        System.out.println("Byte value: " + b);
//        System.out.println("Int value: " + num);


		
	}
}
