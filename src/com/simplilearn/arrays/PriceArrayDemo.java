package com.simplilearn.arrays;

public class PriceArrayDemo {
	public static void main(String[] args) {
		
		String[] item= {"Pen","Pencil","Eraser","Sketchpen","Mechanical pencil"};
		float[] price= {12.58f, 12.59f, 12.60f, 13.11f, 5.04f, 9.00f, 58.88f};
		
		for (int i=0 ; i<item.length ; i++) {
			System.out.println((item[i]+" cost is "+price[i]));
		}
	}
}

