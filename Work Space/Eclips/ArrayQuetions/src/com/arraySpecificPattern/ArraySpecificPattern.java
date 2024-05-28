package com.arraySpecificPattern;

public class ArraySpecificPattern {
	public static void printSpecifically(int arr[]) {
		int brr[]=new int[arr.length];
		int min=0;
		int max=arr.length-1;
		for (int i = 0; i < brr.length; i++) {
			if(i%2!=0) {
				brr[i]=arr[min];
				min++;
			}
			else {
				brr[i]=arr[max];
				max--;
			}
		}
		for(int x:brr) {
			System.out.print(x+" ");
		}
	}

}
