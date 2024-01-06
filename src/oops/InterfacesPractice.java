package oops;


interface Anima{
	
	void run();
	
}
class Horse implements Anima{
	public void run(){
		
		System.out.println("walks on  legs");
	}
}

public class InterfacesPractice {
	
           Horse n = new Horse();
}
