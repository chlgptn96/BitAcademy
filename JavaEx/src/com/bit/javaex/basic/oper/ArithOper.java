package com.bit.javaex.basic.oper;

public class ArithOper {

	public static void main(String[] args) {
		// 산술연산자
		int a = 7;
		int b = 3;
		
		//	부호 연산자 : +, - (일항 연산자)
		System.out.println(-a);	//	부호를 반전
		System.out.println(-1 * a);	
		
		//	사칙 연산 : +, -, *, /, %(나머지)
		System.out.println("정수의 나눗셈: " + (a / b));
		//	정수와 정수의 나눗셈은 정수(몫)
		System.out.println("나머지:" + (a % b));
		//	나눗셈의 해
		System.out.println("나눗셈의 해:" + ((float)a / (float)b));
		System.out.println("나눗셈의 해:" + ((float)a / b)); // 암묵적 캐스팅

		//	증감 연산자: ++, --
		//		연산 순서에 유의, a++와 ++a는 다르다는 점 확인
		System.out.println("A:" + a);
		System.out.println("++a:" + (++a));
		System.out.println("a:" + a);
		
		System.out.println("b:" + b);
		System.out.println("b++:" + (b++));
		System.out.println("b:" + b);
		//	증감 연산자가 다른 연산식에 포함되어 있을경우
		//		가독성이 매우 떨어지므로 가급적 독립적으로 사용하자
		
		// 나눗셈 보충
		//	정수를 0으로 나눠 봅시다.
//		System.out.println(4 / 0);
		//	실수를 0으로 나눠 봅시다.
		System.out.println(4.0 / 0);// Infinity
		
		//	경우에 따라서는 피연산자 값이 Infinity인지 체크 해야할 경우
		System.out.println(Double.isInfinite(4.0 / 0)); // 무한대인지 체크
		System.out.println(Double.isNaN(4.0 / 0));
		//	Infinity는 수치 값이다
	}

}









