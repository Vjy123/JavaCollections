package com.Vijayk;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		String rev= new StringBuffer(str).reverse().toString();
		if(str.equals(rev))
		{
			System.out.println("It is palindrome");
			
		}
		else
		{
			System.out.println("not a palindrome");
		}
           			

	}

}
