package com.java;

public class Oops 
{
	void display(int x,int y) 
	{   int z=x+y;
		System.out.println("result is="+z);
	}

	public static void main(String[] args) 
	{
		Oops op=new Oops();
		
		op.display(4,6);
	}

}
