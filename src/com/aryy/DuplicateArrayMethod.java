package com.aryy;

public class DuplicateArrayMethod {

	public static void main(String[] args) {
		int  []arr= {10,50,30,40,50,69,78,69};
		
		for(int n=0;n<arr.length;n++)
		{
			for(int j=n+1;j<arr.length;j++)
			{
				if(arr[n]==arr[j])
				{
					System.out.println("Duplicate is="+arr[j]);
				}
			}
			
		}

	}

}
