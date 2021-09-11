package com.aryy;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) 
	{
		String names[]= {"Vijay","kumar","kuncha,","Vijay","Hari","kumar"};
		Set<String> s = new HashSet<>();

        for (String name : names) {
            if (s.add(name) == false) {
                System.out.println("found a duplicate element in array : "
                        + name);
				
		}
		

        }
	}

	}

