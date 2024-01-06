package lulu;

public class Practice11 {
public static void main(String[] args) {
	
	
	String x="khadeer123shabbir     ";
	
	char z=' ';
	
		
	for(int i=x.length()-1;i>=0;i--) {
if(x.charAt(i)>='a'&&x.charAt(i)<='z')
{
	z=x.charAt(i);
		System.out.print(z);
}
	}
	
} 
}
