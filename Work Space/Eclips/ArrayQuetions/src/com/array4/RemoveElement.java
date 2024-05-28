package com.array4;

public class RemoveElement {
	public static void RemoveSpecifElement(int n,int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				arr[i]=0;
			}
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
