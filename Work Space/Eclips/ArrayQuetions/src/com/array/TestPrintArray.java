package com.array;

import java.util.Scanner;

public class TestPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the number of array elements");
		int n=kb.nextInt();
		int []arr=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=kb.nextInt();
		}
		PrintArray.printArrayelEments(arr);

	}

}
