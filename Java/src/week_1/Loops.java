package week_1;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		
		
		/*
		 * for (num = 0; num < 11; num++ ) {
		 * 
		 * System.out.println(num);
		 * 
		 * }
		 */
		
		/*
		 * while(num < 11) {
		 * 
		 * System.out.println(num); num = num +1;
		 * 
		 * }
		 */
		
		/*
		 * do { System.out.println(num); num = num +1; }while(num < 11);
		 */
		
		//Print the sum of First  n Natural Number? n = 4
		/*
		 * for(int i = 1; i <= n; i++) {
		 * 
		 * sum = sum + i; } System.out.println(sum);
		 */
		
		//Print the table of a number  input by the user? n = user input.
		for(int i = 1; i < 11; i++) {
			
			System.out.println(n * i);
			
		}
		
	}

}
