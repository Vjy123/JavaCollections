package com.aryy;

public class Palan {

	public static void main(String[] args) {
		String str="Madam";
		String rev=new StringBuffer(str).reverse().toString();
		if(str.equals (rev))
		{
			System.out.println("It is palindrome ");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}
	}

}
