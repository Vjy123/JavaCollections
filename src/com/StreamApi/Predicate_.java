package com.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_ {

	public static void main(String[] args) 
	{
		List<Integer> al=Arrays.asList(2,40,50,6,7,8,9,3);
		
		int sum=0;
		 for(int i:al)
		 {
			 if(i%5==0)
			 {
				 sum+=i*2;
			 }
			 System.out.println(sum);
		 }
		
		
		
		Predicate<Integer>p=new Predicate<Integer>()
				{
					public boolean test(Integer i)
					{ 
						return i%5==0;
					}
				};
				System.out.println(al.stream()
						.filter(p)
						.reduce(0,(c,e)->c+e));
		 
	}

}
