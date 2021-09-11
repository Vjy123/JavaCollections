package com.opps;
class Addd
{
	int n1;
	int n2;
	int result;

	public void Adding()
	{
		System.out.println("hello");
	}
	public void Adding(int n1)
	{
		System.out.println(n1);
	}
	public void Adding(int n1,int n2)
	{ 
		System.out.println(n1+n2);
	}
	public void Adding(int n1,int n2,int n3)
	{
		System.out.println(n1+n2+n3);
	}
}
public class Method_Over {

	public static void main(String[] args) 
	{
		Addd a=new Addd();
		a.Adding(4,5);
        		

	}

}

