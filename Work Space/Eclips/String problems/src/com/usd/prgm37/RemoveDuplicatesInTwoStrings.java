package com.usd.prgm37;

public class RemoveDuplicatesInTwoStrings {
	public static void removeDuplicates(String s1,String s2) {
		for(int i=0;i<s1.length();i++) {
			boolean flag=false;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.print(s1.charAt(i));
			}
		}
	}

}
