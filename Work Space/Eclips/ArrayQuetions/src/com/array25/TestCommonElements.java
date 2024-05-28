package com.array25;

import java.util.Scanner;

public class TestCommonElements {

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
		System.out.println("enter size of an array");
		int b=kb.nextInt();
		int brr[]=new int[b];
		System.out.println("enter elements in an array");
		for (int i = 0; i < brr.length; i++) {
			brr[i]=kb.nextInt();
		}
		System.out.println("enter size of an array");
		int c=kb.nextInt();
		int crr[]=new int[c];
		System.out.println("enter elements in an array");
		for (int i = 0; i < crr.length; i++) {
			crr[i]=kb.nextInt();
		}
		CommonElementsIn3Array.findCommonElements(arr, brr, crr);


	}

}
