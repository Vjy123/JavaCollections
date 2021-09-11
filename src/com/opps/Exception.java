package com.opps;

public class Exception {

	public static void main(String[] args) 
	{
	try
	{   int arr[]=null;
	    arr[5]=8;
		int i=9/0;
		System.out.println(i);
	}
	catch(ArithmeticException  e)
	{
		System.out.println("Error.....");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Out of Bound Exception");
	}
	catch(NullPointerException n)
	{
		System.out.println("Null Pointer Exception");
	}
	finally
	{
		System.out.println("hello");
	}
}

	
}

