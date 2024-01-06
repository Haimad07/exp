package oops;

abstract class Animal{
 String Species;
 String color;
  void walk() {
	  System.out.println("walks on four legs");
  }
}
  
  class Cat extends Animal{
	  
  }


public class AbstractionPractice {
	
	public static void main(String[] args) {
		Cat h= new Cat();
		h.color = "black";
		h.walk();
		
	      
	}

}
