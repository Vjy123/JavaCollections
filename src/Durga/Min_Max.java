package Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Min_Max {

	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(50);
		al.add(60);
		al.add(5);
		al.add(7);
		al.add(9);
		System.out.println(al);
		Integer s=al.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println("min value:"+s);
	

	}

}
