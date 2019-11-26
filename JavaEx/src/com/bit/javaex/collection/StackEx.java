package com.bit.javaex.collection;

import java.util.Stack;

public class StackEx {
	//	Stack 
	//		Last Input First Output
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//	Stack은 Vector를 상속해서 만듦 -> 버퍼가 있는 자료형
		//	루프를 돌면서 stack에 값을 집어 넣어 봅시다.
		for (int i = 1; i <= 10; i++) {
			stack.push(i);	//	스택에 input
		}
		System.out.println("STACK:" + stack);
		
		//	가장 마지막 값을 확인 : peek
		int out = stack.peek(); //	데이터를 추출하지는 않는다
		System.out.println("가장 마지막 입력값:" + out);
		System.out.println("STACK:" + stack);
		
		out = stack.pop();	//	데이터를 추출
		System.out.println("POP:" + out);
		System.out.println("STACK:" + stack);
		
		//	루프를 돌면서 데이터를 pop
		while(!stack.empty()) {
			//	비어 있는 stack에서 데이터를 pop 할 경우 익셉션 발생
			System.out.println("POP:" + stack.pop());
			System.out.println("STACK:" + stack);
		}

	}

}
