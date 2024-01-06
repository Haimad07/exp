package practice;

public class PrinIntegerAppendedLength {

	public static void main(String[] args) {
		String str = "1234ab567810";
		String num ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			num=str.charAt(i)+num;
			int z = Integer.parseInt(num);
			
			if(str.substring(0, i).length()==z) {
				System.out.println(str.substring(0,i));
				System.exit(0);
			}
		}
	}
}
