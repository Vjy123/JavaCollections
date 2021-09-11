package com.opps;

class A
{
	public int add(int i,int j)
	{
		return (i+j);
	}
	
}
class B extends A
{
	public int sub(int i,int j)
	{
		return (i-j);
	}
	
}
class C extends B
{
	public int mul(int i,int j)
	{
		return (i*j);
	}
}

public class Inheritences {

	public static void main(String[] args) 
	{
		
		 C a=new C();
		 int k=a.add(4,5);
		 System.out.println(k);
		 int t=a.sub(9,5);
		 System.out.println(t);
		 int s=a.mul(5,5);
		 System.out.println(s);



	}

}
