package com.staa.PractisePrograms;

public class OddEvenNumberInArray {
	public static void main(String[] args) {
		
		int arr[]= {6,2,7,3,5};
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				System.out.println("This Number is "+arr[i]+" Even");
			}else {
				System.out.println("This Number is "+arr[i]+" Odd");
			}
			
		}
		
	}
		
}
