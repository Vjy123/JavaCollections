package com.aryy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmStrong {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader bdr=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		String s1=bdr.readLine();
		int num=Integer.parseInt(s1);
		int n,sum=0,r;
		n=num;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=r/10;
		}
		if (sum==num)
		{
			System.out.println("ArmStrong of num is="+sum);
		}
		else 
		{
			System.out.println("not a arm Strong");
		}
		
		

	}

}
