package lulu;

public class PracticeSelectionSort {
	public static void main(String[] args) {
		int arr[] = {20,4,6,32,9,11};
		
		int min ;int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			min=i;
			
			for(int j=1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					j=min;
				}
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		
	}
	
}

	
