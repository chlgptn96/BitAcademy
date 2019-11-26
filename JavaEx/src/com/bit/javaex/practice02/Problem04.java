package com.bit.javaex.practice02;

public class Problem04 {
	   
	   public static void Problem04() {
	      
	      int lotto[] = new int [6];
	      for(int i=0; i<lotto.length; i++) {
	         lotto[i] = (int) (Math.random()*45 +1);
	      
	         
	   
	         for(int j=0; j<i; j++) {
	            if(lotto[j]==lotto[i]){
	               i--;
	         
	            }
	            
	         }
	         System.out.println(lotto[i]);
	         
	         
	      }
	      
	   }

	   public static void main(String[] args) {
	      Problem04();

	   }

	}

	//   배열을 사용하여 1~45 까지의 숫자 중 임의의 6개의 숫자를 출력하세요
	//   중복 체크할 것