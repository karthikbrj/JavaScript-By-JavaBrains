package com.array4;

public class DuplicateNumbers {
	public static void checkDuplicateNumbers(int arr[]) {
		int []crr=AscendingOrder.isAscending(arr);
		for (int i = 0; i < crr.length; i++) {
			int count=1;
			for (int j = i+1; j < crr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}else {
					break;
				}
			}
			if(count>1) {
				System.out.println("duplicates numbr is "+arr[i]+" count is "+count);
				i=i+(count-1);
			}
			else {
				count=1;
			}
		}
	}

}
