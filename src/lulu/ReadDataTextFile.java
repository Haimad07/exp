package lulu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataTextFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\user4\\Desktop\\Java Programs.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str ;
		
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}

}
