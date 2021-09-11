package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) 
	{
		List<Integer> values=Arrays.asList(1,2,45,34,4,7,45);
		Stream<Integer> s=values.stream();
		s.forEach(System.out::println);
		//s.forEach(System.out::println);//Stream is already used we can not reuse it
		 

	}

}
