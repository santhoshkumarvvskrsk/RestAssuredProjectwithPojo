package com.staa.PractisePrograms;

public class DuplicateCharctersinString {

	public static void main(String[] args) {
		String str = "go to gym";
		char ch[] = str.toCharArray();
		int count;
		System.out.println("Duplicate Character in String");
		for(int i=0;i<str.length();i++) {
			count=1;
			for(int j=i+1;j<str.length();j++) {
				if(ch[i] == ch[j]) {
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i]!='0') {
				System.out.println(ch[i]+"--"+count);
			}
		}
	}

}
