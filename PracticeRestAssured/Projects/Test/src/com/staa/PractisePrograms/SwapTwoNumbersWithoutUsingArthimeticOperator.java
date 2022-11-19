package com.staa.PractisePrograms;

public class SwapTwoNumbersWithoutUsingArthimeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5; int n2=7;
		System.out.println("Before Swap"+n1+","+n2);
		n1 = n1 ^ n2;
		n2 = n1 ^ n2;
		n1 = n1 ^ n2;
		System.out.println("Before Swap"+n1+","+n2);
	}

}
