package week_2;

class Class_Object {
	
	
		
		int Eid;
		String Ename;
		char grd;
	
	
	void printData() {
		
		System.out.println(Eid+" "+Ename+" "+grd);
		
	}
	
	/*// Method 
	 * void setData(int id, String name, char gd) {
	 * 
	 * Eid = id; Ename = name; grd = gd;
	 * 
	 * 
	 * 
	 * }
	 */
	
	//Constructor
	Class_Object(int id, String name, char gd){
		
		Eid = id;
		Ename = name;
		grd = gd;
		
	}
	

}
