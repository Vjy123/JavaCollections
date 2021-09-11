package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) 
	{
		List<Integer> l=Arrays.asList(20,30,24,5,6,8);
		System.out.println(l.stream()
				.map(i->i*2)
				.reduce(0,(c,e)->c+e));
	}

}
