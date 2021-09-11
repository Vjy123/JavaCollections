package com.opps;
class Objects
{
	int num1;
	int num2;
	int r;
   public void results()
	{
		r=num1+num2;
	}
}
public class Object {

	public static void main(String  [] args) 
	{
		Objects ob=new Objects();
		ob.num1=4;
		ob.num2=7;
		ob.results();
		System.out.println(ob.r);
		

	}

}
