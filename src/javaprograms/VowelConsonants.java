package javaprograms;

public class VowelConsonants {

	public static void main(String[] args) {
		
		String x ="aradhya brilliance center";
		
		char y[]= x.toCharArray();
		int vowelCnt =0;
		int consonentCnt =0;
		int splCnt=0;
		for(int i=0;i<y.length;i++) {
			if(y[i]>='a'&&y[i]<='z') {
			if(y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u') {
				
				vowelCnt++;
			}
			else {
				consonentCnt++;
			}
			}
			else {
				splCnt++;
			}
			
		}
		
		System.out.println("Vowel = "+vowelCnt+ " Consonents = "+consonentCnt+" Special = "+splCnt);
	}
}
