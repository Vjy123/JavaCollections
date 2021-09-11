package Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) 
	{
		ArrayList<Integer> marks=new ArrayList<>();
	marks.add(30);
	marks.add(32);
	marks.add(31);
	marks.add(37);
	marks.add(56);
	marks.add(76);
	marks.add(23);
	List<Integer> l=marks.stream().filter(m-> m<=35).map(m-> m+5).collect(Collectors.toList());
	System.out.println(l);
		
		
		
	}

}
