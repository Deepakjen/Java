package week2_OOPS;

class SBI {
	
	String Name = "sbi";
	void data() {
		
		System.out.println("Print the SBI bank");
	}
}

class HDFC  extends SBI{
	
	String Name = "hdfc";
	void print() {
		
		System.out.println("Print the HDFC bank");
	}
	
}

class Bank extends SBI{
	
	String Name = "bank";
	void output() {
		
		System.out.println("Print the  bank name");
	}
	
}

public class Hierarchy {

	public static void main(String[] args) {
		
		
		Bank b = new Bank();
		//HDFC h = new HDFC();
		
		
		
		b.data();
		b.output();
		
		

	}

}
