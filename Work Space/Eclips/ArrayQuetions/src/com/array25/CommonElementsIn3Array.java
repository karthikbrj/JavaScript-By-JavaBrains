package com.array25;

public class CommonElementsIn3Array {
	public static void findCommonElements(int []arr,int []brr,int []crr) {
		for(int i=0,j=0,k=0;i<arr.length && j<brr.length && k<crr.length;) {
			if(arr[i]==brr[j] && brr[j]==crr[k]) {
				System.out.println(arr[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(arr[i]<brr[j]) {
				i++;
			}
			else if(brr[j]<crr[k]) {
				j++;
			}
			else {
				k++;
			}
		
		
		}

}}
