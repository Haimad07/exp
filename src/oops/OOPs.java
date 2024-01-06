package oops;

class Pen{
	String color;
	String type;//ballpoint or gel
	
	public void write() {
		System.out.println("writing something");
	}
	public void printColor(){
		System.out.println("color = "+this.color);
	}
	public void printType() {
		System.out.println("type = "+this.type);
	}
}

class Student{
	String name;
	String age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

Student(){
	System.out.println("Constructer called");
}
}

public class OOPs {
	
	public static void main(String[] args) {
		  Pen pen1 = new Pen();
		  
		  pen1.color="red";
		  pen1.type="gel";
		  
		  pen1.printColor();
		  pen1.printType();
		  pen1.write();
		  
		  Pen pen2 =new Pen();
		  
		  pen2.color ="blue";
		  pen2.type ="ballpoint";
		  
		  pen2.printColor();
		  pen2.printType();
		  pen2.write();
		  System.out.println(" ");
		  
		  Student s = new Student();
		  
		  s.name ="Ahmed";
		  s.age ="25";
		  
		  s.printInfo();
		
	}

}
