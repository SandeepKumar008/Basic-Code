package com.practice.day1;

import java.util.Scanner;

public class FriendlyPair {
	public static void main(String[] args) {
		
	
	Scanner se = new Scanner(System.in);
	//Initialization of 2 numbers for user Inputs
	int sumx=0;
	int sumy=0;
	int x= se.nextInt();
	
	int y= se.nextInt();
	
	for(int i=1;i<x;i++) {
		if(x%i==0) {
			sumx +=i;	
		}
	}
	for(int j =2; j<y ;j++) {
		if(y%j==0) {
			sumy+=j;
		}
		
	}
	if((x/sumx)==(y/sumy)) {
		System.out.println("The Numbers are Friendly Pair");
		
	}
	else {
		System.out.println("The Numbers Are Not Friendly Pair");
	}
	}
	
	
}
	
