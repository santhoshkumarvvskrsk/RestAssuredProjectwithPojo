package com.staa.PractisePrograms;

public class SortAscending {

	public static void main(String[] args) {
	int arr[] = new int[] {6,8,4,2,5};
	int temp =0;
	
	for (int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
//			System.out.println()
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
//	System.out.println(arr.toJson())
	

	}

}
