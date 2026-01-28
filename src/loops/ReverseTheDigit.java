package loops;

import java.util.Scanner;

public class ReverseTheDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n = sc.nextInt();

		int rem;
		int mul = 0;
		while(n>0) {
			rem = n % 10;
			mul = mul * 10 + rem;
			n = n/10;
		}
		System.out.println(mul);
		

	}
}
