package week_1;

import java.util.*;

public class Operator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b = sc.nextInt();
		
		/*
		 * //Pre- increment 
		 * b = ++a; 
		 * System.out.println(a); // a = 10 ----> 11
		 * System.out.println(b); // b = 0 -----> 11
		 */
		
		/*
		 * //Post-Increment 
		 * b = a++; 
		 * System.out.println(a); // a = 10 ------> 11
		 * System.out.println(b); // b = 0 ------>10
		 */		
		
		/*
		 * //Pre-decrement 
		 * b = --a; 
		 * System.out.println(a); //a = 10 ------>9
		 * System.out.println(b); //b = 0 -------> 9
		 */
		
		//Pre-decrement
		b = a--;
		System.out.println(a); //a = 10 ------> 9
		System.out.println(b); //b = 0 -------> 10
		
	}

}
