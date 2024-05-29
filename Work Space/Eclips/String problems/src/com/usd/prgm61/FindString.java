package com.usd.prgm61;

public class FindString {
	public static boolean checkStringAndPrint(String s1,char ch) {
		char crr[]=s1.toCharArray();
		boolean flag=false;
		for(int i=0;i<crr.length-2;i++) {
			if(crr[i]==ch && crr[i+2]==ch) {
				flag=true;
			}
		}if(flag==true) {
			return true;
		}else {
			return false;
		}
	}

}
