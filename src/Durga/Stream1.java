package Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(1);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(35);
		al.add(40);
		int sum=0;
		for(Integer i:al)
		{
			if(i%2==0)
			{
				sum=sum+1;
			}
			System.out.println(i);
			System.out.println(i+5);
		}
		//List<Integer>l=al.stream().filter(i->i%2==0).map(i->i+5).collect(Collectors.toList());
		//System.out.println(l);
		 

	}

}
