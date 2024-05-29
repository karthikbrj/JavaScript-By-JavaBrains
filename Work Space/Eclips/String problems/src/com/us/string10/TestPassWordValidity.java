package com.us.string10;

import java.util.Scanner;

public class TestPassWordValidity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.next();
		String b=PassWordValidity.checkPasswordValidity(s);
		System.out.println(b);

	}

}
