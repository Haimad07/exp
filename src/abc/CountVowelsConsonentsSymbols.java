package abc;

public class CountVowelsConsonentsSymbols {
	
	public static void main(String[] args) {
		
		String x ="ahmed's pasha";
		
		char y[]=x.toCharArray();
		int size =y.length;
		int countVowels = 0;
		int countConsonents =0;
		int countSpecial =0;
		for(int i=0;i<size;i++) {
			if(y[i]>='a'&&y[i]<='z') {
			if(y[i]=='a' || y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u') {
				countVowels++;
			}
			else {
				countConsonents++;
			}
			}
			else {
				countSpecial++;
			}
		}
		System.out.println(countVowels);
		System.out.println(countConsonents);
		System.out.println(countSpecial);
		
	}
	
}
