package com.array4;

import java.util.Scanner;

public class TestCopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter number elements in an array");
		int a=kb.nextInt();
		int crr[]=new int[a];
		System.out.println("enter an array elements");
		for (int i = 0; i < crr.length; i++) {
			crr[i]=kb.nextInt();
		}
		CopyArray.copyAndPrint(crr);

	}

}
