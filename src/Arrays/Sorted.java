package Arrays;

import java.util.Scanner;

public class Sorted {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size of Array: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter the Elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		
		}
//		int[] a=new int[]{25,56,32,98,14,32,12,11,36,74,89};
		
		int temp;
		for(int i1=0;i1<n;i1++) {
		 for(int j=i1+1;j<n;j++) {
			 if(arr[i1]>arr[j]) {
				 temp=arr[j];
				 arr[j]=arr[i1];
				 arr[i1]=temp;
			 }
		 }
		 System.out.println(arr[i1]);
		}
				
	}
}

