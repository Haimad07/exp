 package lulu;

public class FIndlength {
	
	public static void main(String[] args) {
		
		String x ="123456788";
		
		String num ="";
		for(int i=x.length()-1;i>=0;i--) {
			 num = x.charAt(i)+num;
			 int t = Integer.parseInt(num);
			
			if(x.substring(0,i).length()==t) {
				
				System.out.println(x.substring(0,i));
				break;
			}
		}
		
	}

}
