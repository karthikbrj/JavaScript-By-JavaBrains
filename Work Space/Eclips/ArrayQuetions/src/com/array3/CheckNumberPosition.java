package com.array3;

public class CheckNumberPosition {
	public static int printNumberPosition(int n,int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		return -1;
		
	}

}
