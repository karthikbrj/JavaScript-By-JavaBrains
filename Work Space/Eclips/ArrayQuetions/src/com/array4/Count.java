package com.array4;

public class Count {
	public static void findPositiveAndNegative(int arr[]) {
		int countZeros=0;
		int countPositive=0;
		int countNegative=0;
		int countOdd=0;
		int countEven=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				countNegative++;
			}
			if(arr[i]==0) {
				countZeros++;
			}
			if(arr[i]>0) {
				countPositive++;
				if(arr[i]%2==0) {
					countEven++;
				}
				else {
					countOdd++;
				}
			}
		}
		System.out.println("number of zeros are "+countZeros);
		System.out.println("number of positive number are "+countPositive);
		System.out.println("number of negative numbers are "+countNegative);
		System.out.println("number of even numbers are "+countEven);
		System.out.println("number of odd numbers are "+countOdd);
		
	}

}
