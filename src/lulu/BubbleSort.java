package lulu;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int a[] = {36,19,29,12,5};
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;i++) {
				
			if(a[i]>=a[i+j]) {
				System.out.print(a[i]);
			}
			}
		}

	}
}