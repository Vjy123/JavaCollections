package Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Count {

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
		System.out.println(marks);
		long l=marks.stream().filter(m-> m<=35).count();
		System.out.println(l);
		 
	}

}
