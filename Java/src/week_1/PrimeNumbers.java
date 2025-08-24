package week_1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to find the prime number 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num < 1) {
			
			System.out.println("prime number");
			
		}
		else {
			
			System.out.println("Not a prime number");
			
		}
	}

}
