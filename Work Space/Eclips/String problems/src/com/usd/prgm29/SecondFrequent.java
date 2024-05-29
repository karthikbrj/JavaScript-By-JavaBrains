package com.usd.prgm29;

public class SecondFrequent {
	public static void findSecondFrequentCharacter(String s) {
		char crr[]=s.toCharArray();
		for (int i = 0; i < crr.length; i++) {
			int count=0;
			for (int j =0; j < crr.length; j++) {
				if((crr[i]==crr[j])&& (j<i))
				{
					break;
				}
				
			else if((crr[i]==crr[j])) 
				{
					count++;
				}
			}
			if(count>1) {
				System.out.println(crr[i]+" "+count);
				//System.out.print(count);
			}
		}
	}

}
