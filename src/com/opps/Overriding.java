package com.opps;

public class Overriding 
{   void add(int x,int y)
	{
		System.out.println("addition="+(x+y));
		
	}
	void add(int x,int y,int z)
	{
		System.out.println("addition="+(x+y+z));
	}
	void add(double r,float s)
	{
		System.out.println("Addition is="+(r+s));
	}
	  static void add(double t,double y)
	{
		System.out.println("Addition is="+(t+y));
	}


	public static void main(String[] args) {
		Overriding or=new Overriding();
		or.add(4,3);
		or.add(2,3,4);
		or.add(4, 3);
		or.add(3, 6);
		

	}

}
