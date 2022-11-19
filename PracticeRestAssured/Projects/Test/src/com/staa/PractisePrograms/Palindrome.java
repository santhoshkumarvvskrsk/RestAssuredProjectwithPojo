package com.staa.PractisePrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 373, rem,sum=0;
		int temp = num;
		while (num>0) {
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(sum == temp) {
			System.out.println("Given number "+temp+" is Palindrome ");
		}else {
			System.out.println("Given number "+temp+" is not Palindrome ");
		}
	}

}
