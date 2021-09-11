package Durga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) 
	{
		List <Integer>l=Arrays.asList(3,2,1,4,5,10,15,20);
		//l.add(3);
		//l.add(2);
		//l.add(1);
		//l.add(4);
		//Collections.sort(l);
		//Collections.reverse(l);
		l.stream().sorted((i,j)->(i<j)?1:(i>j)?-1:0).filter(i->i%2==0).map(i-> i/2).sorted((i,j)->(i>j)?-1:(i<j)?1:0).forEach(System.out::println);;
		
		//l.stream().sorted((i,j)->i.compareTo(j)).forEach(i->System.out.println(i));
		//for(Integer j:l)
		{
			//System.out.println(j);
		}
		}

}
