package oops;

class Student1{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		}
	Student1(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class OopsConstructors {
	
	public static void main(String[] args) {
		
		Student1 s = new Student1("Ahmed",24);
		
		s.printInfo();
	}

}
