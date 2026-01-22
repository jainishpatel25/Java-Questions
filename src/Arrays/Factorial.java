package Arrays;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Number: ");
	int number = sc.nextInt();
	
	int i , fact = 1;
	for(i=1;i<=number;i++) {
		if(number == 0 || number == 1) {
			System.out.println("This Factorial always be 1");
		}
		else {
		fact = fact * i;
	}
	}
	System.out.println("Factorial Of " +number+ " is : " +fact);
	



}
}
