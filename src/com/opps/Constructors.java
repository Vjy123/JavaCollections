package com.opps;
class Add//Constructor Overloading
{
	int num1;
	int num2;
	int result;
	public Add()
	{
		num1=3;
		num2=5;
		System.out.println("Hello");
		
	}
	public Add(int n)
	{
		num1=n;
	}
	public Add(int n,float s)
	{   num1=n;
		num2=(int)s;
		
	}
}
public class Constructors {

	public static void main(String[] args) 
	{ 
		Add ad=new Add(5,9);
	System.out.println(ad.num1+ad.num2);
		
		

	}

}
