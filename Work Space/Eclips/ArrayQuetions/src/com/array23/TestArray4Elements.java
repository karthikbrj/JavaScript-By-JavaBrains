package com.array23;

import java.util.Scanner;

public class TestArray4Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter size of an array");
		int a=kb.nextInt();
		int arr[]=new int[a];
		System.out.println("enter elements in an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println("enter number ");
		int b=kb.nextInt();
		Array4ElementsArray.findSum(arr, b);

	}

}
