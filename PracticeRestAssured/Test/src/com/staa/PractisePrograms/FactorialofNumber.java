package com.staa.PractisePrograms;

public class FactorialofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		int factorial=1;
		for (int i =1;i<=number;i++) {
			factorial = factorial*i;
		}
		System.out.println("Factorial of "+number + " is "+factorial);
	}

}
