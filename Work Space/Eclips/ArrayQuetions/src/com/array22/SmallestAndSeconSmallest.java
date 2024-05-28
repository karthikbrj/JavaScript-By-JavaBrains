package com.array22;

import com.array4.AscendingOrder;

public class SmallestAndSeconSmallest {
	public static void findSmallAndSeconSmall(int arr[]) {
		int brr[]=AscendingOrder.isAscending(arr);
		System.out.println("smallest number is "+brr[0]);
		System.out.println("second smallest number is "+brr[1]);
	}

}
