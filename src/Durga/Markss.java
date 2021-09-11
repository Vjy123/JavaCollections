package Durga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Markss {

	public static void main(String[] args) 
	{
		//List<Integer> l=Arrays.asList(20,35,45,29,46,20);
		
		//double n=l.stream().filter(i->i%2==0).map(m->m+6).count();//forEach(System.out::println);
		 //System.out.println(n);
		ArrayList<Integer>k=new ArrayList<>();
		k.add(20);
		k.add(35);
		k.add(45);
		k.add(29);
		k.add(46);
		k.add(20);
		double g=k.stream().filter(i->i%2==0).map(m->m+6).count();
		//.collect(Collectors.toList());
		System.out.println(g);
	}

}
