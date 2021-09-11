package com.opps;
class Outer
{
	  static int id;
	 static 
	 {
		 id=7;
	 }
	Outer()
		{
			id=5;
		}
		

	public void show()
	{  
		System.out.println("hello="+id);
	}
    static class Inner
	{ 
		public void display()
		{
		  System.out.println("hai");
		}
	}
}
public class InnerCls {

	public static void main(String[] args) 
	{
		Outer og=new Outer();
		og.show();
		Outer.Inner in=new Outer.Inner();
		in.display();

	}

}
