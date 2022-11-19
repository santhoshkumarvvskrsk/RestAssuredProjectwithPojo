package com.staa.PractisePrograms;

public class ReverseEachWordofString {

	public static void main(String[] args) {
		String str = "Go to School";
		str = str.toLowerCase();
		String words[] = str.split(" ");
		String revstr ="";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String revword ="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			revstr = revstr +" "+revword;
		}
		System.out.println("The actual string is "+ str);
		System.out.println("The Reverse String is "+revstr);
	}

}
