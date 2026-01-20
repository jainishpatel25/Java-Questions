package ControlFlow;

import java.util.Scanner;

public class Greatest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value Of A: ");
		int a = sc.nextInt();
		System.out.print("Enter the Value Of B: ");
		int b = sc.nextInt();
		System.out.print("Enter the Value Of C: ");
		int c = sc.nextInt();
		
		
		if(a>b && a>c)
		{
			System.out.println("The Greatest Number is A:" +a);
		}
		else if(b>a && b>c) {
			System.out.println("Greatest Number is B: " +b);
		}
		else if(c>a && c>b){
			System.out.println("The Greatest Number is C: "+c);
		}else {
			System.out.println("There are no Greatest Value in this Three All Are Same");
		}
		
//		System.out.println("The Greatest Number of Among Three is : ");
	}

}
