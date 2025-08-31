package week_1;

import java.util.Scanner;

public class Coditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int month = sc.nextInt();
		
		/*
		 * if( age >= 18 ) {
		 * 
		 * System.out.println("Your are Eligible"); } else {
		 * 
		 * System.out.println("Your are not eligible");
		 * 
		 * }
		 */
		
		switch(month) {
			
		case 1:
			System.out.println("Jan");
			break;
		
		case 2:
			System.out.println("Feb");
			break;
		
		case 3:
			System.out.println("Mar");
			break;
		
			
		default:
			System.out.println("Not match with any month");
		}
		
		
	}

}
