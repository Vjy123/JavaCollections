package com.vijay;

public class Arary {

	public static void main(String[] args) {
		int arr[]= {10,40,50,30};
		int i,j;
		int max=arr[0],min=arr[0];
		for (i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-1;j++)
			{
				if(arr[i]>max)
				{ 
					max=arr[i];
					System.out.println("Maxnum is ="+max);
				}
				
			}
		}
		

	}

}
