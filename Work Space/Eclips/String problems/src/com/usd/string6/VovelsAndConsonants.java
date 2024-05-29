package com.usd.string6;

public class VovelsAndConsonants {
	public static void countVovels(String s)
	 {
		 int count=0;
		 int consonantCount=0;
		 char []arr=s.toCharArray();
		 for(int i=0;i<arr.length;i++)
		 {
			 switch(arr[i])
			 {
				 case 'a':
				 count++;
				 break;
				 case 'A':
				 count++;
				 break;
				 case 'e':
				 count++;
				 break;
				 case 'E':
				 count++;
				 break;
				 case 'i':
				 count++;
				 break;
				 case 'I':
				 count++;
				 break;
				 case 'o':
				 count++;
				 break;
				 case 'O':
				 count++;
				 break;
				 case 'u':
				 count++;
				 break;
				 case 'U':
				 count++;
				 break;
				 default:
				 consonantCount++;
				 
			 }
		 }
		 System.out.println("number of vovels is "+count);
		 System.out.println("number of consonsnts is "+consonantCount);
}
}