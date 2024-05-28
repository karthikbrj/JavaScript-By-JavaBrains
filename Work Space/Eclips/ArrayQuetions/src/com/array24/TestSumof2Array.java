package com.array24;

import java.util.Scanner;

public class TestSumof2Array {

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
		System.out.println("enter second array size");
		int b=kb.nextInt();
		int brr[]=new int[b];
		System.out.println("enter elements in an array");
		for (int i = 0; i < brr.length; i++) {
			brr[i]=kb.nextInt();
		}
		double d=Sumof2Array.findSum(arr, brr);
		System.out.println(d);

	}

}
