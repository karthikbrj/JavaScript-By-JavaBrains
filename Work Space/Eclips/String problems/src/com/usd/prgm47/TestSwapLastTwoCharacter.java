package com.usd.prgm47;

import java.util.Scanner;

public class TestSwapLastTwoCharacter {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		SwapLastTwoCharacter.swaplast2Characters(s);
	}

}
