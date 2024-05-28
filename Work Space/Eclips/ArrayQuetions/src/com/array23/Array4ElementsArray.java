package com.array23;

public class Array4ElementsArray {
	public static void findSum(int arr[],int num) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int l = j+1; l < arr.length; l++) {
					for (int k = l+1; k < arr.length; k++) {
						if(arr[i]+arr[j]+arr[l]+arr[k]==num) {
							System.out.println(arr[i]+" + "+arr[j]+" + "+arr[l]+" + "+arr[k]+" = "+num);
						}
						
					}
				}
			}
			
		}
		
	}

}
