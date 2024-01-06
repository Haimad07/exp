package lulu;

class Animal{
	public void walk() {
		System.out.println("Walks on 4 legs");
		}
	private void runs() {
		System.out.println("chicken runs");
	}
}

public class Test {
	int num=100;
	public void calc(int num) {
		this.num=num*10;
		
	}
		public void printNum() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Test obj = new Test();
		obj.calc(3);
		obj.printNum();
		Animal horse = new Animal();
		Animal dog = new Animal();
		Animal chicken = new Animal();
		chicken.walk();
		horse.walk();
		dog.walk();
	}

}
