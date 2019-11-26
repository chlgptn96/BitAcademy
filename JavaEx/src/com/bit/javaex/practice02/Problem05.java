package com.bit.javaex.practice02;

public class Problem05 {
	public static void Problem05() {
		
		int scoreboard[][] = {
				{80, 75, 90, 95, 78},
				{92, 88, 89, 92, 70},
				{78, 80, 89, 86, 63},
				{83, 84, 89, 87, 75},
				{89, 83, 93, 94, 78}
		};
		
		int total = 0;
		int nanugi = 0;
		double result = 0;
		for(int i=0; i< scoreboard.length; i++) {
			for(int j=0; j<scoreboard.length; j++) {
				
				if(scoreboard[i][j]>=85) {
					total += scoreboard[i][j];
					nanugi = total/scoreboard[i][j];
					result = (double)total/nanugi;
					
					
				}
				
			}
	
		}
		System.out.println(total);
		System.out.println(result);
//		배열 내에서 85점 이상인 점수만 뽑아, 총 합과 평균값을 산출하세요.
		
	}

	public static void main(String[] args) {
		Problem05();

	}

}








