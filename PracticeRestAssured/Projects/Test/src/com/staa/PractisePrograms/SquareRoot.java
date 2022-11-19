package com.staa.PractisePrograms;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double 	sq = Math.sqrt(9);
		//System.out.println("Square Root of 9 is "+sq);
		int number =9;
		double temp; double sr = number/2;
		do {
			temp = sr;
			sr = (temp+(number/temp))/2;
			
		}while((temp-sr)!=0);
		System.out.println(sr);
		
	}

}
