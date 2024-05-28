package com.array17;

public class MissingNumber {
	public static int findMissingNumber(int arr[]) {
		int sum=0;
		int n=arr[arr.length-1];
		int sum1=(n*(n+1)/2);
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int num=sum1-sum;
		return num;
		
	}

}
