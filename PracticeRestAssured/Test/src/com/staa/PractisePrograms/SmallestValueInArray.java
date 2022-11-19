package com.staa.PractisePrograms;

public class SmallestValueInArray {

	public static void main(String[] args) {
				int arr[] = new int[] {85,25,33,405,51};
				int max = arr[0];
				for (int i=0; i<arr.length;i++) {
					if(max>arr[i]) {
						max = arr[i];
					 }
				}
				System.out.println(max);
			}


	}

