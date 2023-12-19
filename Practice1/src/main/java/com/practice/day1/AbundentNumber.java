package com.practice.day1;

import java.util.Scanner;

public class AbundentNumber {
	
	public static void main(String[] args) {
		int sum=0;
		Scanner se = new Scanner(System.in);
		int n = se.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}
		if (sum>n) {
			System.out.println(n+" is an Abundent Number");
			
		}
		else {
			System.out.println(n+ " is Not a Abundent number ");
		}
	}

}
