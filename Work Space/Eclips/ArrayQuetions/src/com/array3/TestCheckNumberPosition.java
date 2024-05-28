package com.array3;

import java.util.Scanner;

public class TestCheckNumberPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter number of elements in an array");
		int a=kb.nextInt();
		int crr[]=new int[a];
		System.out.println("enter an elements in array");
		for (int i = 0; i < crr.length; i++) {
			crr[i]=kb.nextInt();
		}
		System.out.println("enter elements to find position");
		int b=kb.nextInt();
		int c=CheckNumberPosition.printNumberPosition(b, crr);
		System.out.println(c);

	}

}
