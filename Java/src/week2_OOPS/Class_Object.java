package week2_OOPS;

public class Class_Object {
	 // Variables
	 int id;
	 String name;
	 double sal;
	
	//Method
	void printData() {
		
		System.out.println(id+" "+name+" "+sal);
		
	}
	
	//2. Method
	void printParameterData(int i, String N, double S) {
		
		id = i;
		name = N;
		sal = S;
		
	}
	
	
	//Constructor
	Class_Object(int i, String N, double S){
		
		id = i;
		name = N;
		sal = S;
		
	}

}
