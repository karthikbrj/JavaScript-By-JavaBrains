package com.array4;

public class AverageOfArray {
	public static double findAverage(int []arr) {
		double sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		double d=sum/arr.length;
		return d;
		
	}

}
