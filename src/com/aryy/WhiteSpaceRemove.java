package com.aryy;

public class WhiteSpaceRemove {

	public static void main(String[] args) {
		String str="vi  jay   k um ar   k   un  cham";
		String str2=str.replaceAll("\\s","");
		System.out.println(str2);

	}

}
