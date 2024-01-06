package oops;

class Student2 {
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student2(Student2 s2){	
		this.name = s2.name;
		this.age=s2.age;
	}
	Student2(){
		
	}
}
public class CopyConstructors {
public static void main(String[] args) {
	Student2 s1 = new Student2();
	
	s1.name="Ahmed";
	s1.age=24;
	
	s1.printInfo();  
	
	Student2 s2 = new Student2(s1);
	
}
}
