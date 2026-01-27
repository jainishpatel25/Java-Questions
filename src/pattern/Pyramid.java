package pattern;

public class Pyramid {
public static void main(String[] args) {
	
	int i,j,k,l;
	
	int n=4;
	
	for(i=1;i<=n;i++) 
	{
		for(j=1;j<=n-i;j++) 
		{	
			System.out.print(" ");	
		}
		for(k=1;k<i*2;k++) 
		{
			System.out.print("*");
		}
//		for(k=1;k<=i;k++) 
//		{
//			System.out.print("*");
//		}
//		for(l=2;l<=i;l++) 
//		{
//			System.out.print("*");
//		}
		System.out.println();
	}
	}
	
}

