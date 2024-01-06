package company.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
	
	public static void main(String[] args) {
		
		String inputfile = "C:\\Users\\user4\\Desktop\\ahmed1.txt";
		
		String line ="";
		
		try {
			  FileReader fr = new FileReader(inputfile);
			  BufferedReader  br = new BufferedReader(fr);
			  FileWriter fw = new FileWriter("C:\\Users\\user4\\Desktop\\file.txt");
			  BufferedWriter bw = new BufferedWriter(fw);
			  while((line =br.readLine())!=null) {
				  String[] words = line.split(" ");
				  
				  for(String word : words) {
					  
					  bw.append(word);
					  bw.append("\n");
				  }
				  
			  }
			  br.close();
			  bw.close();
			}
		catch(Exception e) {
			
		}
	}

}
