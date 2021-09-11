package Durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class To_Array {

	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		//System.out.println(al);
		Integer[]i=al.stream().toArray(Integer[]::new);//Constructor Reference(new)
		//Stream.of(i);//Coverting array into stream 
		 for(Integer s:i)//Enhance for Loop//Gives values
		 {
			 System.out.println(s);
		 }
		 //System.out.print(i);//Gives Only Address 
	}

}
