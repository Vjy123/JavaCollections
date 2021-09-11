package com.aryy;

import java.util.HashSet;
import java.util.Set;

public class Sett {

	public static void main(String[] args) 
	{
		int[]arr={10,20,30,40,30,20};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate is ="+arr[j]);
				}
			}
		}
		
	}
}
		