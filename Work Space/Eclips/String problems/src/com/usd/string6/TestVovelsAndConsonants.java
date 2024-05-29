package com.usd.string6;

import java.util.Scanner;

public class TestVovelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a String");
		String s=kb.nextLine();
		VovelsAndConsonants.countVovels(s);

	}

}
