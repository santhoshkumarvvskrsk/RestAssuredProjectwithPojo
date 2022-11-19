package com.staa.PractisePrograms;

public class SecondLargestValueInArray {

	public static void main(String[] args) {
		int arr[] = {8,2,5}; 
		int temp,size;
		size = arr.length;
		for (int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		for(int i=0;i<size;i++) {
//			System.out.print(arr[i]);
//		}
		System.out.println(arr[size-2]);
	}

}
