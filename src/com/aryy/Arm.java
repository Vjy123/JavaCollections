package com.aryy;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		int count=0,a,temp,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num");
		num=sc.nextInt();
		temp=num;
		while (num!=0)
		{
			a=num%10;
			num=num/10;
			count=count+(a*a*a);
		}
		if(temp==count)
		{
			System.out.println("ArmStrong num="+count);
			
		}
		else 
		{
			System.out.println("Num is not arm Strong num");
		}
	}

}
