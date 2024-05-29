package com.usd.string8;

import java.util.Scanner;

public class TestCountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		WordCount.countWordsInString(s);
		

	}

}
