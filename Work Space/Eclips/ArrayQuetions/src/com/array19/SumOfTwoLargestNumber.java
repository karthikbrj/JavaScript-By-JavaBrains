package com.array19;

import com.array4.AscendingOrder;

public class SumOfTwoLargestNumber {
	public static int findSum(int arr[]) {
		int brr[]=AscendingOrder.isAscending(arr);
		return (brr[brr.length-1]+brr[brr.length-2]);
		
		
	}

}
