package com.array2;

public class CheckNumberPresent {
	public static boolean isNumberPresent(int n,int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				return true; 
			}
		}
		return false;
		
	}

}
