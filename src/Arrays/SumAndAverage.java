package Arrays;

import java.util.Scanner;

public class SumAndAverage {
	
	
	public static int calculateSum(int[] a) 
	{	
		int sum=0;	
		for(int i=0 ; i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static double calculateAverage(int[] a) 
	{
		int sum = calculateSum(a);
		return (double ) sum / a.length;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size of Array: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum= calculateSum(arr);
		double average = calculateAverage(arr);
	
		System.out.println();
		System.out.println("Sum of Array: " +sum);
		System.out.println("Average of Array: " +average);
		

		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter The Size of Array: ");
//		int a=sc.nextInt();
//		
//		int[] arr=new int[a];
//		
//		System.out.print("Enter the Elements: ");
//		for(int i=0;i<a;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		System.out.print("Elements Are: ");
//		for(int i=0;i<a;i++) {	
//			System.out.print(" "+arr[i]);
//		}
//		
//		int sum=0;
//		
//		for(int i=0;i<a;i++) {
//			sum+=arr[i];
//		}
//		
//		double av=(double) sum / a;
//		
//		System.out.println();
//		System.out.println("Sum of Array: " +sum);
//		System.out.println("Average of Array: " +av);
//		
		
	}

}
