package ControlFlow;

import java.util.Scanner;

public class AgeGroups {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Age of a Person: ");
		int person=sc.nextInt();
		
		if(person >= 60) {
			System.out.println("The Person Is Senior");
		}
		else if(person <= 59 && person >= 20) {
			System.out.println("The Person Is Adult");
		}
		else if(person <=19 && person >= 14) {
			System.out.println("The Person Is Teen");
		}
		else if(person <=13 ) {
			System.out.println("The Person Is Child");
		}
	}
}
