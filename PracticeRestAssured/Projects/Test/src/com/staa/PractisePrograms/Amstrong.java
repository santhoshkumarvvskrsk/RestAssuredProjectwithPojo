package com.staa.PractisePrograms;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 371, result =0, rem;
		int temp = number;
		while (number >0) {
			rem = number%10;
			number = number/10;
			result = result + (rem*rem*rem);
		}
		if(result == temp) {
			System.out.println("Given number "+ temp+" is Amstrong");
		}else {
			System.out.println("Given number "+ temp+" is not Amstrong");
			
		}
		
	}

}
