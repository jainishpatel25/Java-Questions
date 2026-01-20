package ControlFlow;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Marks: ");
		int marks=sc.nextInt();
		
		if(marks <= 100 && marks >= 90) {
			System.out.println("The Grade Is A");
		}
		else if(marks <= 89 && marks >= 75 ) {
			System.out.println("The Grade is B");
		}
		else if(marks <= 74 && marks >= 60 ) {
			System.out.println("The Grade is C");
		}
		else if(marks <= 59 && marks >= 30 ) {
			System.out.println("The Grade is D");
		}
		else {
			System.out.println("Fail");
		}
		
  }
}
