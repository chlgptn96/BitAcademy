package com.bit.javaex.practice01;

public class Problem01 {

	public static void Problem01() {
		
		int i;
		for(i=1; i<=100; i++) {
			if( i%5 != 0 || i%7 != 0)
			continue;
			System.out.println(i);
			
		}
		
		
	}

	public static void main(String[] args) {
		// 연습문제 코드 풀이
		Problem01();

	}

}
/*
 * 1에서 100까지의 수에서 5의 배수 이면서 7의 배수인 수를 출력하세요
 * 
 * 35, 70
 */