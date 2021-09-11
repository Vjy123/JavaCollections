package com.TreeSet;

import java.util.HashSet;

import com.aryy.ArrayList;

public class TreeSet {

	public static void main(String[] args) {
		 HashSet<String> treeset = new HashSet<String>();
	      treeset.add("Good");
	      treeset.add("For");
	      treeset.add("Health");
	      //Add Duplicate Element
	      treeset.add("Good");
	      System.out.println("TreeSet : ");
	      for (String temp : treeset) {
	         System.out.println(temp);
}
	}
}