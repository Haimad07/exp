package lulu;

// steps:
// 1.Create  a String object x as the reference.
// 2.extract the data from string object and place it in a character array y.
// 3.Create count and index i initialize to zero
// 4.Iterate over each character and increment the count of numeric value.
//5.Print the count.

public class FindInteger {
	
	public static void main(String[] args) {
		
		String x ="1abcd234ghhh";
		 char y[]=x.toCharArray();
		 int size = y.length;
		  
		 int i =0;
		 int count=0;
		 while(i!=size) {
			 
		 if (y[i]>='0' && y[i]<='9') {
			 count++;
		 }
		 i++;
		 }
		 System.out.println(count);
		
	}

}
