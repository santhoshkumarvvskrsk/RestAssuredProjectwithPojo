package com.staa.PractisePrograms;

public class CountofVowels {

	public static void main(String[] args) {
		int vCount =0,cCount=0;
		String s = "Today we will learn simple java";
		s = s.toLowerCase();
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)== 'u') {
				vCount++;
			}else if(s.charAt(i)>= 'a' && s.charAt(i)<='z') {
				cCount++;
			}
		}
		System.out.println("The Count of Vowel is "+ vCount);
		System.out.println("The Count of Consonant "+ cCount);

	}

}
