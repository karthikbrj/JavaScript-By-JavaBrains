package com.usd.prgm14;

public class SpecifiedCharacter {
	public static void checkSpecifiedCharacter(String s,String Str) {
		boolean flag=false;
		String arr[]=s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(Str)) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		
		
	}

}
