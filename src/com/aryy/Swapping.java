package com.aryy;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int x,y,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y values");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping="+x+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping="+x+y);
		
		

	}

}
