package com.usd.prgm29;

import java.util.Scanner;

public class TestSecondFrequent {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		SecondFrequent.findSecondFrequentCharacter(s);
	}

}
