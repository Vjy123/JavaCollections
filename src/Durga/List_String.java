package Durga;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class List_String {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("vijay kumar");
		al.add("hari babu ");
		al.add("gayathri ");
		al.add("suresh venkata");
		al.add("kumar kuncham");
		/*Comparator<String> a=(i,j)->
		{ 
		    int k=i.length();
			int l=j.length();
		
			if(k<l)
			{
				return 1;
			}
			else if(k>l)
			{
				return -1;
			}
			else
			{
				return i.compareTo(j);
			}
		};*/
		List<String> s=al.stream().sorted((i,j)->i.length()<j.length()?1:-1).collect(Collectors.toList());
		System.out.println(s);
		
	 

	}

}
