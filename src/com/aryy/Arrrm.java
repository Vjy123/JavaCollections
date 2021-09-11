package com.aryy;

import java.util.Scanner;

public class Arrrm {

	public static void main(String[] args) {
		int n,sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=r/10;
		}
		if(sum==n)
		{
			System.out.println("Arm strong="+sum);
		}
		else
		{
			System.out.println("not a arm strong");
		}

	}
}