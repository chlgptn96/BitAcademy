package com.bit.javaex.practice02;

public class Problem03 {
	   
	   public static void Problem03() {
	      String answer="";
	      String answer2="";
	      char m=',';
	      char c[] = {
	            'T','h','i','s',
	            ' ',
	            'i','s',
	            ' ',
	            'a',
	            ' ',
	            'p','e','n','c','i','l'};
	      
	      for(int i=0; i<c.length; i++) {
	            
	            if(0<=i) {
	               answer += c[i] ;   
	               
	            } if ((0<=i)&&(c[i]==' ')){
	               c[i] = m;
	               answer2 += c[i];
	               
	            }else {
	               answer2 += c[i];
	            }
	            
	            
	         }
	         
	         System.out.println(answer);
	         System.out.println(answer2);
	      
	      
	      
	   }

	   public static void main(String[] args) {
	      Problem03();

	   }

	}


