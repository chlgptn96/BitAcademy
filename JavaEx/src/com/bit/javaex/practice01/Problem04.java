package com.bit.javaex.practice01;

public class Problem04 {
	
	public static void Problem04() {

		for ( int i=0; i<=9; i++) {
			for(int j=i+1; j<=i+10; j++) {
				System.out.print(j +"\t");
			}
			System.out.println();
		}
		
	}

	
	public static void main(String[] args) {
		Problem04();

	}

}
