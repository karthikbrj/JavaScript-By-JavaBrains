package com.usd.prgm34;

public class RemoveDuplicates {
	public static void removeDuplicatesAndPrint(String s) {
		StringBuilder sb = new StringBuilder();
		char crr[] = s.toCharArray();
		for (int i = 0; i < crr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < crr.length; j++) {
				if (crr[i] == crr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				sb.append(crr[i]);
			}
		}
		System.out.println(sb);
		//approach 2
		StringBuilder sb1=new StringBuilder();
		for(int k=0;k<s.length();k++) {
				char ch=s.charAt(k);
				int idx=s.indexOf(ch, k+1);
				if(idx==-1) {
					sb1.append(ch);
				}
			}
		System.out.println(sb1);
	}
}
