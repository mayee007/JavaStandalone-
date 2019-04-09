package com.mine;


public class StringManipulation {

	public static void main(String[] args) {
		String str1 = "hello"; 
		String str2 = "hello"; 
		String str3 = new String("world"); 
		String str4 = new String("world");
		
		String longString = "welcome to the world of string programming"; 
		
		if (str1 == str2) { 
			System.out.println("str1 == str2"); 
		} 

		if (str3.equals(str4)) { 
			System.out.println("str3 == str4"); 
		}
		
		System.out.println("length = " + longString.length()); 
	}

}