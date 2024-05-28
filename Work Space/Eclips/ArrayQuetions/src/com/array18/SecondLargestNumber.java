package com.array18;

import com.array4.AscendingOrder;

public class SecondLargestNumber {
	public static int  findSecondLargestNumber(int arr[]) {
		int secondMaximum=0;
		int brr[]=AscendingOrder.isAscending(arr);
		return secondMaximum=brr[brr.length-2];
	}

}
