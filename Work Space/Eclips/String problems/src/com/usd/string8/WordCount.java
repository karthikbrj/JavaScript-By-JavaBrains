package com.usd.string8;

public class WordCount {
	 public static void countWordsInString(String s)
	 {
		 int count=0;
		String [] arr=s.split(" ");
		 for(int i=0;i<arr.length;i++)
		 {
			  count++;  
		 }
		 System.out.println(count);
	 }

}
