package com.usd.prgm32;

import java.util.Scanner;

public class TestAllPermutation {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		AllPermutations.printAllPermutations(s,"");
		
		
	}

}
