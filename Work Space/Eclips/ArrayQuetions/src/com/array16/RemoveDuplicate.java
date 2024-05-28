package com.array16;
import com.array4.AscendingOrder;

public class RemoveDuplicate {
	public static void removeDuplicates(int arr[]) {
		int []crr=AscendingOrder.isAscending(arr);
		int length=crr.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(crr[i]==crr[j]) {
					crr[j]=crr[length-1];
					length--;
					j--;
				}
				else {
					break;
				}
			}
			
		}
		int brr[]=new int[length];
		for (int i = 0; i < brr.length; i++) {
			brr[i]=crr[i];
		}
		for(int x:brr) {
			System.out.print(x+" ");
		}
		
	}
	

}
