package lulu;

public class Cwh_methods {
	static int logic(int x , int y) {

	int z;
	if(x>y) {
		z=x+y;
		System.out.println(z);
	}
	else {
		z=2*(x+y);
		System.out.println(z);
	}
return z;
	}
	public static void main(String[] args) {
		
		int a =  7;
		int b =  8;
		int c;
      c= logic(a,b);
      
      int a1 = 11;
      int b1 = 14;
      int c1;
      
      c1= logic(a1,b1);
      
}
}
