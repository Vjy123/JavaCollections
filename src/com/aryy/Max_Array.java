package com.aryy;

public class Max_Array {

	public static void main(String[] args) {
		//int arr[]=new int [10];
		int arr[]= {10,2,56,46,75,105,9,6,456,7};
		int n,sum=0,max=arr[0],min=arr[0];
		for (n=0;n<arr.length;n++)
		{
			sum=sum+arr[n];
		}
		for (n=1;n<arr.length;n++)
		{
			if(arr[n]>max)
			{ max=arr[n];
			}
			if (arr[n]<min)
			{
				min=arr[n];
			}
		}
		System.out.println("summ is="+sum);
		System.out.println("max is="+max);
		System.out.println("min is="+min);
		
		
		

	}

}
