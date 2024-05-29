package com.usd.prgm15;

import java.util.Scanner;

public class TestNewString {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a size of array");
		int a=kb.nextInt();
		char arr[]=new char[a];
		System.out.println("enter a character ");
		for (int i = 0; i < arr.length; i++) {
			 arr[i]=kb.next().charAt(0);
		}
		NewString.charToString(arr);
		
	}

}
