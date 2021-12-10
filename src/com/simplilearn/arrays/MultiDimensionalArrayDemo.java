package com.simplilearn.arrays;

import java.util.Arrays;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		// two dimensional array
		int[][] numbers = { {2,4,6,8,10} , {3,5,9,11,13} };
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		
		System.out.println("-----------------");
		for (int row = 0; row < numbers.length; row++) {
			System.out.println(Arrays.toString(numbers[row]));
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.println("[ "+ row +", "+col + "] => "+numbers[row][col]);
				}
		}
		System.out.println("-----------------");
		
	int[][][] x = { {{4,5,6,7,8,9}, {4,8,6,2,1,7}}, 
										{{5,54,25,89,5,1},{1,2,2,5,8,9}},
										{{4,8,9,2,5,6}, {4,8,9,4,1,2}}};
	int[][][] y = { {{4,5,6,7,8,9}}, 
			{{1,2,2,5,8,9}},
			{{4,8,9,4,1,2}}};
	int[][][] z= {{{1}}};
	System.out.println("First Array"+Arrays.toString(x[0][0]));
	System.out.println("First Array"+Arrays.toString(z[0][0]));
	System.out.println("-----------------");
	System.out.println("Second Array"+Arrays.toString(x[1][1]));
	System.out.println("-----------------");
	System.out.println("Third Array"+Arrays.toString(x[2][1]));
	//To iterate over a three dimensional array
	for (int first=0; first<x.length;first++) {
		for (int second=0; second<x[first].length ; second++) {
			for (int third = 0; third <x[first][second].length ; third++) {
				System.out.println("["+first+","+second+","+third+"]"+x[first][second][third]);
			}
			System.out.println("-----------------");
		}
		System.out.println("*******************");
	}
}
}
