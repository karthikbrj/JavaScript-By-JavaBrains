package com.array27;

public class FirstEvenAndOdd {
	public static void printEvenAndOdd(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]%2==0) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
			System.out.print(arr[i]+" ");
		}
		
	}

}
