package com.aryy;

import java.util.Scanner;

public class Palindromee {

	public static void main(String[] args) {
	   int n, r,sum=0,temp;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any num to check");
	   n=sc.nextInt();
	   temp=n;
	   while(n>0)
	   {
		   r=n%10;
		   sum=(sum*10)+r;
		   n=n/10;
		   
	   }
	   if(temp==sum)
	   {
		   System.out.println("Num is palindrome");
	   }
	   else
	   {
		   System.out.println("not a palindrome");
	   }
	   

	}

}
