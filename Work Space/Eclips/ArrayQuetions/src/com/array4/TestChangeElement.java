package com.array4;

import java.util.Scanner;

public class TestChangeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter number of elements in an array");
		int a=kb.nextInt();
		int []arr=new int[a];
		System.out.println("enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=kb.nextInt();
		}
		System.out.println("enter a position to replace");
		int k=kb.nextInt();
		System.out.println("enter number to replace");
		int n=kb.nextInt();
		ChangeElement.isChangeElement(k,n, arr);

	}

}
