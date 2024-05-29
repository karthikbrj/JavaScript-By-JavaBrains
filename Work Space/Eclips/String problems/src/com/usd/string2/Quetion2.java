package com.usd.string2;

public class Quetion2 {
	public static void findUnicode(int n,String str) {
		char []arr=str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(i==n) {
				System.out.println((int)arr[i]);
			}
		}
	}

}
