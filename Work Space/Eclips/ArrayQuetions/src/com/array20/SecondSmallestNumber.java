package com.array20;

import com.array4.AscendingOrder;

public class SecondSmallestNumber {
	public static int  findSecondSmallNumber(int arr[]) {
		int brr[]=AscendingOrder.isAscending(arr);
		return brr[1];
		
		
	}

}
