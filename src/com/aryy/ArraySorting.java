package com.aryy;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,temp=0;
		System.out.println("Enter any num:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) 
		{ for(int j=i+1;j<arr.length;j++) 
		{   
			if( arr[i]<arr[j]) 
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(arr[i]);
		}
		
		

	}

}
