package com.aryy;

public class Factorial {

	public static void main(String[] args) 
	{
		int i=1,n=5,f=1;
		while(i<=n)
		{
			f=f*i;
			i++;
		}
		System.out.println("Factorial is ="+f);
	}

}
