package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Checking {

	public static void main(String[] args) 
	{
		List<Integer> al=Arrays.asList(20,40,4,6,3);
		
		System.out.println(al.stream().filter(Checking::isDivisible).map(Checking::mapDouble).findFirst().orElse(0));
		

	}
	public static boolean  isDivisible(Integer i)
	{
		System.out.println("is divisible"+i);
		return i%5==0;
	}
	public static int  mapDouble(Integer i)
	{ 
		System.out.println("is mapdouble"+i);
		return i*2;
		
	}

}
