package com.java;

public class Method 
{
	int add()
	{
		int a=10,b=29,c=a+b;
		
		return c;
	}

	public static void main(String[] args) {

      Method m=new Method();
      float result=m.add();
      System.out.println("Result is:"+result);
	}

}
