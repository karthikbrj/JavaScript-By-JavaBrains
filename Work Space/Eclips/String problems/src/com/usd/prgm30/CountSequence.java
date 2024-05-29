package com.usd.prgm30;

public class CountSequence {
	public static void countCharactersInSequence(String s) {
		char[]crr=s.toCharArray();
		for (int i = 0; i < crr.length; i++) {
			int count=1;
			for (int j = i+1; j < crr.length; j++) {
				if(crr[i]==crr[j]) {
					count++;
				}else {
					break;
				}
			}
			System.out.println(crr[i]+" "+count);
			i=i+count-1;
		}
		
	}

}
