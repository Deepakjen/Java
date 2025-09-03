package week2_OOPS;

public class Polymorphism {
	
	int a = 10 , b = 50;
	
	void sum() {
		System.out.println(a+b);
		
	}
	
	void sum(int x, int y){
		System.out.println(x+y);
		
		
	}
	
	void sum(int x, double y) {
		System.out.println(x+y);
		
	}
	
	void sum(double x, int y) {
		System.out.println(x+y);
		
	}
	
	

}
