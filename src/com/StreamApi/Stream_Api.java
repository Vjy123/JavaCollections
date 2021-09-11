package com.StreamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class Stream_Api {

	public static void main(String[] args) 
	{
		List<Integer> value=Arrays.asList(20,49,60,50);
		 
		//for(int i:value)
		{
			//System.out.println(i);
		}
		//value.forEach(i->System.out.println(i));
		//value.forEach(System.out::println);;
		Iterator<Integer> ki=value.iterator();
		//while(ki.hasNext())
		{
			//System.out.println(ki.next());
		}
		//value.forEach(System.out::println);
		//value.forEach(i->System.out.println(i));
		Stream<Integer> s=value.stream();
		System.out.println(s.filter(i->i%5!=0)
		.findFirst().orElse(0));
		
		 
	}

}
