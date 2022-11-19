package com.staa.PractisePrograms;

public class NumberPrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1001;
		int temp=0;
		for (int i=2; i<=number/2;i++) {
			if(number%i == 0) {
				temp = temp+1;
				break;
			}
		}
		if(temp==0) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is Not Prime");
		}
	}

}
