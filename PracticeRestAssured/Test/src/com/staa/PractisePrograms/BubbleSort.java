package com.staa.PractisePrograms;

public class BubbleSort {

	public static void main(String[] args) {
		int [] intary = {3,40,35,2};
		int n=intary.length;
		int temp=0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(intary[i]>intary[j]) {
					temp = intary[i];
					intary[i] = intary[j];
					intary[j] = temp;
				}
			}
		}
		System.out.println("After Bubble Sort");
		for(int i=0;i<n;i++) {
			System.out.println(intary[i]);
		}
		

	}

}
