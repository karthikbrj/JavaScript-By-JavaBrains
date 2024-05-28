package com.array4;

public class SumOfArray {
	public static int findSum(int arr[]) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
		
	}

}
