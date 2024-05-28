package com.array21;

import com.array4.AscendingOrder;

public class DifferenceBetweenLargestAndSmallestNumber {
	public static int findDiffernce(int arr[]) {
		int brr[]=AscendingOrder.isAscending(arr);
		return (brr[brr.length-1]-brr[0]);
		
	}

}
