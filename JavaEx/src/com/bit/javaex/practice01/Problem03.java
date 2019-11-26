package com.bit.javaex.practice01;

import java.util.Scanner;

public class Problem03 {

	public static void Problem03() {
		
		int dan;
		int num = 0;
		
		for (dan=1; dan<=9; dan++) {
			for (num=2; num<=9; num++) {
				System.out.print(num +"*"+dan+"="+num*dan +"\t");
				
			}
			System.out.println();
		}
		
			
		
		
	}
	

	public static void main(String[] args) {
		Problem03();
	}

}


