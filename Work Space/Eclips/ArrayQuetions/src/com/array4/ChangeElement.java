package com.array4;

public class ChangeElement {
	public static void isChangeElement(int n,int num,int[]arr) {
		int position=n;
		for (int i = 0; i < arr.length; i++) {
			arr[position]=num;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
