package com.staa.PractisePrograms;

public class FindMissingNumber {

	public static void main(String[] args) {
		int sum=0;
		int arr[] = {1,2,4,5};
		int n = arr.length;
		int total_sum = (n+1)*(n+2)/2;
		System.out.println("Sum of all Numbers "+ total_sum);
		for(int i=0;i<n;i++) {
			sum = sum+arr[i];
		}
		int missing_no = total_sum -sum;
		System.out.println("The Missing Number is "+missing_no);

	}

}
