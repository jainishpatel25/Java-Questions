package TestJava;
//
//public class Questions {
//	
//	private void k(){
//      System.out.println("private method");
//  }
//
//  static void m(Object o){
//      System.out.println("object");
//  }
//  static void m(Integer o){
//      System.out.println("Interger ");
//  }
//	
//	
//public static void main(String[] args) {
//	
//	
////	 Questions h = new Questions();
////   h.k();
//   m(null);
//	
//}
//}
public class Questions{
	public static boolean isSubSequence(int main[],int a[]) {
		
		int i =0;
		int j = 0;
		
		while(i < main.length &&  j < a.length) {
			
			if(main[i] == a[j]) {
			j++;
			}
		
		i++;
		
	}
	return j == a.length;

}
	public static void main(String[] args) {
		int main[]={1,2,3,4,5};
		
		int a1[]= {1,3,5};
		int a2[]= {5,1};
		
		System.out.println(isSubSequence(main, a1));
		System.out.println(isSubSequence(main, a2));
	}
}



