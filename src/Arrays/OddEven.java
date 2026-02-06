package Arrays;

public class OddEven {
	
	
	public static void main(String[] args) {
		int[] a=new int[]{2,7,4,6,3,5};
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<a.length;i++) {
		
			if(a[i]%2==0) {
//				System.out.println("Even Number: "+a[i]);
				evenCount++;
//				System.out.println(a[i]);
				
			}else {
//				System.out.println("Odd Number: "+a[i]);
				oddCount++;
			}
		}
		
		
		int[] even=new int[evenCount];
		int[] odd=new int[oddCount];
		
		int eIndex=0, oIndex = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[eIndex] = a[i];
				eIndex++;
			}else {
				odd[oIndex] = a[i];
				oIndex++;
			}
		}
		System.out.print("Even Number: ");
		for(int i=0;i<even.length;i++) {
			System.out.print(even[i]);
		}
		
		System.out.println();
		System.out.print("Odd Numbers:"); 
		for (int i = 0; i < odd.length; i++) 
		{ 
			System.out.print(odd[i]); 
		}
		
//		System.out.println(); 
//		System.out.println("Even Count: " +evenCount);
//		System.out.println("Odd Count: " +oddCount);
	}
}
