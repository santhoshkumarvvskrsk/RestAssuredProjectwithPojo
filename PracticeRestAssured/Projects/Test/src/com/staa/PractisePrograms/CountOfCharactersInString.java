package com.staa.PractisePrograms;

public class CountOfCharactersInString {

	public static void main(String[] args) {
		String word = "Learn Java";
//		word = word.replace(" ","");
		int count =0;
//		char [] ch = word.toCharArray();
//		System.out.println(word.length());
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("count of String is "+count);

	}

}
