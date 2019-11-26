package com.bit.javaex;

public class MethodEx {
	public static double getSum(double a, double b) {
		//	a, b는 고정 인자
		//	double 값을 반환해야 한다
		return a + b;
	}
	
	public static double getSumVar(double ... values) {
		//	... 표기는 가변인자를 의미하고
		//		values는 배열로 전달된다
		double total = 0;
		for (double num: values) {
			total += num;
		}
		return total;
	}
	
	public static void printTotal(String message, 
			double ... values) {
		//	반환할 값이 없어도 선언부에서는 리턴 타입이 있어야 한다(void)
		//	고정 인자와 가변인자를 같이 쓸 경우 순서에 유의
		//	먼저 고정 인자, 그 뒤에 가변 인자를 선언해야 한다
		System.out.println(message + " " + getSumVar(values));
		//	return 타입이 void 기 때문에 return 문은 없어도 된다
	}
	
	
	public static void main(String[] args) {
		System.out.println("3 + 5:" + getSum(3, 5));
		System.out.println(getSumVar(3, 5, 6, 1, 3, 2, 7, 5));
		printTotal("결과는?", 3, 5, 6, 1, 3, 2, 7, 5, 9, 3, 1, 2);
	}

}







