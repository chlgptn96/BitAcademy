package com.bit.javaex.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListEx {
	//	List 인터페이스
	//		List는 설계도
	//		실제 클래스는 LinkedList, ArrayList 등으로 구현되어 있다
	//		LinkedList -> 중간에 값이 빈번하게 삽입, 삭제되는 경우 효율적으로 사용
	//		ArrayList -> 맨 뒤에 값이 추가 되는 경우, 중간에서는 빈번하지 않을 경우 효과적
	public static void main(String[] args) {
//		List<String> list = new LinkedList<>();
		List<String> list = new ArrayList<>(); //	교체 가능성

		//	객체추가
		list.add("Java");	//	맨 마지막에 아이템 추가
		list.add("Python");
		list.add("C");
		list.add("C++");
		
		//	객체 삽입
		list.add(2, "Linux");
		System.out.println("list:" + list);
		System.out.println("size of list:" + list.size());
		//	size는 잡을 수 있으나 용량(capacity)은 확인할 수 없다
		
		//	객체 삭제
		list.remove(2);	//	인덱스로 삭제
		list.remove("Python"); //	객체 삭제
		list.remove("C#");	//	없는 객체의 삭제
		
		System.out.println(list);
		//	루프 
		/*
		for (String item: list) {
			System.out.println("Element:" + item);
		}
		*/
		//	Iterator를 이용한 접근
		Iterator<String> it = list.iterator(); // 이터레이터 반환
		while(it.hasNext()) {	//	뒤에 데이터가 있는지 확인
			String item = it.next();
			System.out.println("Element(it):" + item);
		}
		
		//	비우기
		list.clear();
		System.out.println("list:" + list);
	}

}
