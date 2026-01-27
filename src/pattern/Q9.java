package pattern;

public class Q9 {

public static void main(String[] args) {
	int i,j;
//	int space;
	int n=5;
	
	for(i=1;i<=n;i++) {
	for(int space=1;space<=n-i;space++) {
		System.out.print(" ");
	}
		
		for(j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
