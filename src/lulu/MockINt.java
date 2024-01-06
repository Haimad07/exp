package lulu;

public class MockINt {
	
	public static void main(String[] args) {
		
		String s ="aabbccgtgggeeegff";
		
		int[] arr =new int[127];
		
		
		for (int i=0;i<s.length();i++) {
			
			arr[s.charAt(i)] =arr[s.charAt(i)]+1;
			
			
			
		}
	System.out.println(arr);
		int max = -1;
		char c =0;
		
		for(int i=0;i< s.length();i++) {
		 if(max < arr[s.charAt(i)]) {
			 
			 max=arr[s.charAt(i)];
			 
			 c=s.charAt(i);
		 }
		
		}
		System.out.println(c);
	}

}
