package lulu;

public class LinearSearchString {

	public static void main(String[] args) {
		
		String arr[]= {"ahmed","shabbir","khadeer","lulu","aqsa"};
		
		String a ="aqsa";
		int temp =0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].equals(a)) {
				System.out.println(i);
				System.out.println(arr[i]);
				temp =temp+1;
			}
		}
		if(temp==0) {
			System.out.println("String not found");
		}
	}
}
