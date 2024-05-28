package com.cyclicRotation;

public class CyclicRotation {
	public static void printInCyclicRotation(int arr[]) {
		int n=arr[arr.length-1];
		for (int i = arr.length-1;i>0; i--) {
			arr[i]=arr[i-1];
			
		}
		arr[0]=n;
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
	}

}
