package com.java;

public class Check {
	//check SONY is middle or not not 
			//aa SONYbb-true
			//a SONYbb-true
			//a       bn SONYbbb-false
			
	public static void main(String[] args) 
	{
		String str="aSONYbb";
		int s=str.indexOf("S");
		int o=str.indexOf("O");
		int n=str.indexOf("N");
		int y=str.indexOf("Y");
		
		if(s+1==o && o+1==n && n+1==y)
		{
			if (str.length()/2==o ||str.length()/2==n)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
			
		
			

	}

}
