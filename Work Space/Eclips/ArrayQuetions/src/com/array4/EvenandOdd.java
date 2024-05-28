package com.array4;

public class EvenandOdd {
	public static void checkEvenAndOdd(int arr[]) {
		int countEven=0;
		int countOdd=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		System.out.println("number of even numbers are "+countEven);
		System.out.println("number of odd numbers are "+countOdd);
		
	}

}
