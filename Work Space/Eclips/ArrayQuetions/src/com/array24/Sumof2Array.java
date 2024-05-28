package com.array24;

import com.array4.SumOfArray;

public class Sumof2Array {
	public static double findSum(int arr[],int brr[]) {
		int b=SumOfArray.findSum(arr);
		int c=SumOfArray.findSum(brr);
		double d =((double)b+c)/(arr.length+brr.length);
		return d;
	}

}
