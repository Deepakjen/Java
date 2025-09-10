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

class C extends B{

	int c = 60;
	void pritn(){
		System.out.println(c);
		
		
	}
}

public class Inheritanse {

	public static void main(String[] args) {
		
		C obj = new C();
		
		obj.display();
		obj.show();
		obj.pritn();
		
		
	}

}
