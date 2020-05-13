package com.usa.collect;

public class MultiDimention {
	
	
	public static void main(String[] args) {

		int[][] number = { { 11, 22, 33, 44, 55 }, { 12, 22, 33, 44, 59 }, { 15, 25, 35, 45, 56 } };
		
		  for(int r=0;r<3;r++) {
		  
		  for( int c=0;c<5;c++) {
		 
		//System.out.println(number[2][1]); // for specefic result

		System.out.print(" "+number[r][c]);
	}
	System.out.println();

	}

}

}
