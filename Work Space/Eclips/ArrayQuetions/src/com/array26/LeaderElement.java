package com.array26;

public class LeaderElement {
	public static void isLeaderElement(int arr[]) {
		int max=arr[arr.length-1];
		System.out.println(max);
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				System.out.println(max);
			}
		}
		
	}

}
