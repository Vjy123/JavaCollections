package com.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Lists {

	public static void main(String[] args) 
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		//values.forEach(i->System.out.println(i));
		
		//for(int i=0;i<6;i++)
		{
			//System.out.println(values.get(i));
		}
		//Iterator<Integer> l=values.iterator();
		//while(l.hasNext())
		{
			//System.out.println(l.next());
		}
		for(int i:values)
		{
			System.out.println(i);
		}
		
	}
	

}
