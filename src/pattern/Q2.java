package pattern;

public class Q2 {
	
	public static void main(String[] args) {
		  int n = 5;

	        for (int i = 1; i <= n; i++) {          // rows
	            for (int j = n; j >= n - i + 1; j--) {  // numbers decreasing
	                System.out.print(j);
	            }
	            System.out.println();               // move to next line
	        }
	    }


	}




