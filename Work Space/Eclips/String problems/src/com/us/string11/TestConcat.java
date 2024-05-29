package com.us.string11;

import java.util.Scanner;

public class TestConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.next();
		kb.nextLine();
		System.out.println("enter another string");
		String s1=kb.next();
		Concate.concateGivenString(s, s1);

	}

}
