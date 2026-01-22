package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {

//		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int number=sc.nextInt();
		
		int i;
		
		for(i=1;i<=10;i++) {
			System.out.println(+number+ "X" +i+ ":" +number*i);
		}
		
	
		
	
	}
}
