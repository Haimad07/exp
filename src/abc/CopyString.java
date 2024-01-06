package abc;

public class CopyString {
	
	public static void main(String[] args) {
		
		String a = "AQSA";
		String res="";
		
		for(int i=0;i<a.length();i++) {
			res=res+a.charAt(i);
		}
		
		System.out.println(res);
	}

}
