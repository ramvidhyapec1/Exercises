package com.simplilearn.arrays;

public class UserArraysDemo {
	
	public static void main(String[] args) {
		
		// TODO create two diff arrays one for firstname values another for lastnames
		String[] firstname= {"John","Prakash","Aravind","Bhoopathy","Praveen"};
		String[] lastname= {"Kelvin","Lucas","Mariam","Beatele","Yozuk"};
		for (String string : firstname) {
			for (String string2 : lastname) {
				System.out.println(string+" "+string2);
				
			}			
		}
	}
}
