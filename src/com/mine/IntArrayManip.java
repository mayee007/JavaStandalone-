package com.mine;

public class IntArrayManip {
	public static void main(String args[]) { 
		System.out.println("hellasdfo"); 
		
		int[] arr1 = new int[10]; 
		int[] arr2 = {1,3,5,4}; 
		arr1[0] = 10; 
		arr1[1] = 20; 
		
		for (int i=0; i < arr2.length ; i++) { 
			System.out.println(arr2[i]); 
		}
		
		for (int val: arr2) {
			System.out.println(val);
		}
		
	}
}
