package Durga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {

	public static void main(String[] args) 
	{
		List<Integer>al=Arrays.asList(2,3,4,5,6,7);
		Integer[] a=al.stream().toArray(Integer[]::new);
		for(Integer j:a)
		{
			System.out.println(j);
		}
		 
	}

}
