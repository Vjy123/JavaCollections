package Durga;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) 
	{
		//Integer []i= {20,30,40,50};
		
		Stream<Integer> s=Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		

	}

}
