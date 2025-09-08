package week2_OOPS;

class A{
	
	int a = 20;
	void display() {
		System.out.println(a);
	}		
}

class  B extends A {
	
	int b = 40;
	void show() {
		System.out.println(b);
	}	
}

public class Inheritense {

	public static void main(String[] args) {
		
		B obj = new B();
		
		obj.display();
		obj.show();
		
		
	}

}
