package com.Vijayk;

import java.util.HashSet;
import java.util.Set;

public class Dup {

	public static void main(String[] args) {
		 String arr[]= {"v","i","j","a","y","v","j","a"};
		 Set<String> str=new HashSet<String>();
		 for(String aa:arr)
			 
		 {
			 str.add(aa);
			 System.out.println(aa);
		 }

	}

}
