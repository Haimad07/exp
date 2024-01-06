package oops;

class Shape{
	String color;
	public void area() {
		System.out.println("Display area");
	}
}
class Triangle extends Shape{
	public void area( ){
		
		System.out.println("display");
	}
}
class Equalateraltriangle extends Triangle{
	
	public void printArea() {
		System.out.println("display the area");
		
	}
}
	class Circle extends Shape{
		
		public void area(int r) {
			System.out.println((3.14)*r*r);
		}
	}
	class Rhombus extends Shape{
		public void area3() {
			System.out.println("print the area ");
		}
	}
	

public class InheritOOPs {
	
	public static void main(String[] args) {
		
	Triangle t =new Triangle();
	t.area();

	/*	Equalateraltriangle t1 = new Equalateraltriangle();
	t1.color= "blue";
	
      t1.area();
      t1.printArea();
      t1.area(); */
	    
      Circle c1 = new Circle();
      
      c1.area(3);
      
     /* Rhombus r1 =new  Rhombus();
      
      r1.area3();
      r1.area();
 */     
}
}