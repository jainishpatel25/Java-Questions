package Arrays;

import java.util.Scanner;

public class SumOdd {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter The Number: ");
	int n=sc.nextInt();
	
	int i;
	int sum=0;
	
	for(i=0;i<=n;i++) {
	
	if(i%2 != 0) {
		sum = sum + i;
	}	
	
	}
	System.out.println("Odd Number Sum: " +sum);
}
}
