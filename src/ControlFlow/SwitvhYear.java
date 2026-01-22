package ControlFlow;

import java.util.Scanner;

public class SwitvhYear {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Month Number Of The Year: ");
		int n=sc.nextInt();
		System.out.println("Enter The Month Number Of The Year: ");
		int m=sc.nextInt();
		
		switch (n & m) {
		case 1 ->  System.out.println("Jan");
		case 2 ->  System.out.println("Feb");
		case 3 ->  System.out.println("Mar");
		case 4 ->  System.out.println("Apr");
		case 5 ->  System.out.println("May");
		case 6 ->  System.out.println("Jun");
		
		
		
		 
		default ->
		throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}
}
