package com.usd.string21;

public class UniqueIdentifier {
	public static void printIdentifier(String s,String s1,String s2) {
		int i=s.hashCode();
		int j=s1.hashCode();
		int k=s2.hashCode();
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
	}

}
