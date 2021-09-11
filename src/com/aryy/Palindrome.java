package com.aryy;

public class Palindrome {

	public static void main(String args []) {
		String str="MADAM";
		String  rev=new StringBuffer(str).reverse().toString();
		if (str.equals(rev))
		{
			System.out.println("It is a palindrome");

		}
		else
		System.out.println("It is not a Palindrome");

	}

}
