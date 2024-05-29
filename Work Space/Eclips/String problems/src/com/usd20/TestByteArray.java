package com.usd20;

import java.util.Scanner;

public class TestByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a String");
		String s=kb.nextLine();
		kb.nextLine();
		ByteArray.printByteArray(s);
		kb.close();
	}

}
