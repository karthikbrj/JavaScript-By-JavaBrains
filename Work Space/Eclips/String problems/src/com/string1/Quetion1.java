package com.string1;

public class Quetion1 {
	public static void findCharacterOfGivenIndex(int n,String str) {
		char []arr=str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(i==n) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
