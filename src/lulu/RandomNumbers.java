package lulu;

import java.util.Random;

public class RandomNumbers {
     public static void main(String[] args){
	Random rand = new Random();
	
	int x= rand.nextInt(10);
	if(x>=2&&x<=8){
	   System.out.println(x);
	}
}
}