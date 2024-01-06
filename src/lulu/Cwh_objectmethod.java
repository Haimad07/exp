package lulu;

import java.util.Scanner;

public class Cwh_objectmethod {
	int logic(int x , int y) {

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
		
		 Scanner sc =new Scanner(System.in);
		Cwh_objectmethod Obj = new Cwh_objectmethod();
		System.out.println("Enter the number a is ");
		int a =sc.nextInt();
		System.out.println("Enter the number b is ");
		int b =sc.nextInt();
		System.out.println("Enter the number c is ");
		int c;
		 c = Obj.logic(a,b);
		 
		
	}
}