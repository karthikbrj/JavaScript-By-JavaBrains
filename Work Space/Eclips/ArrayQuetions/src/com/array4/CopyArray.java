package com.array4;

public class CopyArray {
	public static void copyAndPrint(int []arr) {
		int []crr=new int[arr.length];
		for(int i=0;i<crr.length;i++) {
			crr[i]=arr[i];
		}
		for(int x:crr) {
			System.out.print(x+" ");
		}
		
	}
}
