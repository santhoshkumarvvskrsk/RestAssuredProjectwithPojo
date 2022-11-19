package com.staa.PractisePrograms;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = new int[] {3,5,4,5,3,1};
		System.out.println("Duplicate Elements in given Array");
		
		for(int i=0; i<a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]==a1[j]) {
					System.out.println(a1[j]);
				}
			}
		}
		
		

	}

}
