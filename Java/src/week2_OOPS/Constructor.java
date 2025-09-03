package week2_OOPS;

public class Constructor {
	
	int x, y;
	
	
	//Default
	Constructor(){
		
		x = 100;
		y = 200;
	}
	
	// Parameterized
	Constructor(int a, int b){
		
		
		x = a;
		y = b;
		
	}
	
	void constructorprintData(){
		
		System.out.println(x+y);
		
	}
}
