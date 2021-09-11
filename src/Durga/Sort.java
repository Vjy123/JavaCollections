package Durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(10);
		al.add(30);
		System.out.println(al);
		//List<Integer> list=al.stream().sorted().collect(Collectors.toList());
		//System.out.println(list);
		//List<Integer> list=al.stream().sorted((i,j)->(i<j)?1:(i>j)?-1:0).collect(Collectors.toList());
		//System.out.println(list);
		//List<Integer> list=al.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
		//System.out.println(list);
		//List<Integer> list=al.stream().sorted((i,j)->-i.compareTo(j)).collect(Collectors.toList());
		//System.out.println(list);
		List<Integer>list=al.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
		System.out.println(list);
		
		
		

	}

}
