package com.aryy;

public class Revverse {

	public static void main(String[] args) {
		int n=434,sum=0,rev=0;
		while(n!=0)
		{
			rev=n%10;
			sum=(sum*10)+rev;
			n=n/10;
		}
		System.out.println(sum);
		

	}

}
