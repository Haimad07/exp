package lulu;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	
	int a[] = {5,7,3,1,2,4};
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int item = sc.nextInt();
	int temp=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==item) {
			System.out.println("Item is present at "+i+" index position");
			temp = temp+1;
		}
		
	}
	if(temp==0) {
		System.out.println("number is not found");
	}
	
}
}
