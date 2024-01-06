package preparation;

public class SecondLargest {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int temp;
		int k=2;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]){
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			if (i==k-1) {
				System.out.println(a[i]);
				break;
		}	
	}

	}
}
