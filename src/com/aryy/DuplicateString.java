package com.aryy;

public class DuplicateString {

	public static void main(String[] args) {
		String str []= {"Vijay","Kumar","kuncham","Hyd","ban","Hyd","Kumar"};
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplicate is="+str[j]);
				}
				
			}
		}
	}

}
