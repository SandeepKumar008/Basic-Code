package com.practice.day1;


	public class StringReverse {

	    public static String reverseOnSpace(String s) {
	        // Create a StringBuilder object to store the reversed string
	        StringBuilder sb = new StringBuilder();

	        // Initialize the index of the last space character or the end of the string
	        int lastSpace = s.length();

	        // Loop through the original string from the end to the beginning
	        for (int i = s.length() - 1; i >= 0; i--) {
	            // If the current character is a space
	            if (s.charAt(i) == ' ') {
	                // Append the substring between the current index and the last space character to the StringBuilder object, followed by a space
	                sb.append(s.substring(i + 1, lastSpace)).append(' ');
	                // Update the last space character index to the current index
	                lastSpace = i;
	            }
	        }

	        // Append the substring between the beginning of the string and the last space character to the StringBuilder object
	        sb.append(s.substring(0, lastSpace));

	        // Return the StringBuilder object as a string
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        // Test the reverseOnSpace method with some examples
	        System.out.println(reverseOnSpace("how are you")); // you are how
	        System.out.println(reverseOnSpace("hello world")); // world hello
	        System.out.println(reverseOnSpace("this is a test")); // test a is this
	    }
	}

