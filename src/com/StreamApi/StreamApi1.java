package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApi1 {

	public static void main(String[] args) 
	{
		List<Integer> al=Arrays.asList(1,2,3,4,5,6);
		//int result=0;
		
		//for(int i:al)
		{ //result=result+i*2;
			//System.out.println(result);
		}
		System.out.println(al.stream().map(i->i*2).reduce(0,(c,e)-> c+e));;
		 

	}

}
