package com.computeAverageExceptLargestandSmallest;

import com.array4.MaximumNumberInArray;
import com.array4.MinimumNumberInArray;
import com.array4.SumOfArray;

public class Average {
	public static double findAverage(int arr[]) {
		int b=SumOfArray.findSum(arr);
		int c=MaximumNumberInArray.findMaximumNumber(arr);
		int d=MinimumNumberInArray.findMinimumNumber(arr);
		double db=b-(c+d);
	    double avg=db/(arr.length-2);
	    return avg;
		
	}

}
