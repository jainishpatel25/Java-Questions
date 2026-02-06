package Arrays;

public class Reverse {

	
	public static void main(String[] args) {
		
		int[] a=new int[] {3,5,7,1,4,8,9};
		
		int revCount=0;
		
		int[] b=new int[a.length];
		
		for(int i=a.length-1;i>=0;i--) {
			b[revCount] = a[i];
//			System.out.println(a[i]);
			revCount++;
		}
		
		System.out.println("Reversed Array: ");
		for(int i=0;i< b.length;i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse Count: " +revCount);		
	}
}
