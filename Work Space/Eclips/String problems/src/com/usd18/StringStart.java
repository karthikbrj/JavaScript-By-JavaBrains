package com.usd18;

public class StringStart {
	public static void checkStartingString(String s,String str) {
		String []srr=s.split(" ");
		String []strr=s.split(" ");
		if(srr[0].equals(strr[0])) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		
	}

}
