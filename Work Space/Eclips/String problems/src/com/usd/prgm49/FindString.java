package com.usd.prgm49;

public class FindString {
	public static void checkString(String s) {
		String s2="black";
		String s3="red";
		String s4=s.substring(0, 5);
		String s5=s.substring(0, 3);
		if(s2.equals(s4)) {
			System.out.println("black");
		}
		if(s3.equals(s5)) {
			System.out.println("red");
		}else {
			System.out.println(" ");
		}
		
		
	}

}
