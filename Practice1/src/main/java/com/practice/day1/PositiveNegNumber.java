package com.practice.day1;

import java.util.Scanner;

public class PositiveNegNumber {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		
		if(x>0) {
			System.out.println("Positive Number");
		}
		else if(x<0) {
			System.out.println("Negative Number");
		}
		else{
			System.out.println("The Number is ZERO");
		}
	}

}
