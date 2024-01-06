package lulu;

import java.io.FileInputStream;

public class Cwh_trycatch2 {
	
	public static void main(String[] args) {
		
		try {
		FileInputStream ahmed =new FileInputStream("D:\resume.txt");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	finally {
		
	}

		
	}

}