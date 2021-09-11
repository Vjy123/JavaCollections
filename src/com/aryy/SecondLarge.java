package com.aryy;

public class SecondLarge {

	public static void main(String[] args) 
	{
		int a[]= {100,10,20,30,40,50,60,70,80,90};
		int large=0;
		int slarge=0;
		for (int i=0;i< a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for (int i=0;i< a.length;i++)
		{
			if(a[i]>large)
			{   slarge=large;
				large=a[i];
				
			}
			else if(a[i]>slarge)
			{
					slarge=a[i];
			}
		}
		System.out.println("Large num="+large);
		System.out.println("Second large num="+slarge);

	}

}
