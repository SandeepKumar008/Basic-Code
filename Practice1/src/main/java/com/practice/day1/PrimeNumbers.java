package com.practice.day1;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		if(x%2==0) {
			System.out.println("Its a Even Number");
			
		}
		else {
			System.out.println("Its a Odd Number");
		}
		
	}


}
