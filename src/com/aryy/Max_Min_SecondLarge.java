package com.aryy;

public class Max_Min_SecondLarge {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,40,50,60,70,80,90,54,100};
		int sum=0,n,max=arr[0],min=arr[0];
		for (n=0;n<arr.length;n++) 
		{
			sum=sum+arr[n];
			System.out.println(sum);
			if(arr[n]>max)
			{   sum=max;
				max=arr[n];
			}
			else if(arr[n]>sum)
			{
				sum=arr[n];
			}
			System.out.println("max num="+max);
			System.out.println("min num="+min);
			System.out.println("Second Large num="+sum);
		}
	}

}
