package com.bit.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {

	public static void arrayCopyEx() {
		//	배열의 복사 -> Arrays 클래스의 도움
		char src[] = "Java Programming".toUpperCase()
				.toCharArray();
		//	출력 : Arrays.toString()
		System.out.println("Arrays.toString:" 
				+ Arrays.toString(src));
		
		//	복사 : 원본 배열 src를 새 배열로 복사합시다
		char target[] = Arrays.copyOf(src, src.length);
		System.out.println("복제된 배열:" + Arrays.toString(target));
		
		//	src와 target 배열은 같은 객체인가? 
		System.out.println(src == target);
		
		//	일부 복사 : copyRangeOf 
		target = Arrays.copyOfRange(src, 5, 10);
		//	src 배열 5번 인덱스부터 10번 인덱스까지
		System.out.println("범위 복사:" + Arrays.toString(target));
	}
	
	public static void sortEx() {
		//	정렬
		int scores[] = { 80, 70, 90, 75, 65, 50, 77, 88 };
		System.out.println("배열 원본:" + Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println("기본 정렬:" + Arrays.toString(scores));
		//	기본 정렬은 오름 차순 : 작은 값 -> 큰 값으로
		//	내림차순 정렬
//		Arrays.sort(scores, Collections.reverseOrder());
		Integer[] scores2 = { 80, 70, 90, 75, 65, 50, 77, 88 };
		Arrays.sort(scores2, Collections.reverseOrder());
		System.out.println("역순 정렬:" + Arrays.toString(scores2));
	} 
	
	public static void binarySearchEx() {
		//	기본 타입의 검색
		int[] nums = { 5, 3, 6, 1, 3, 2, 7, 10 };
		
		//	nums로부터 5를 검색해 봅시다
		//	binarySearch를 위해서는 내부 데이터가 정렬이 되어 있어야 한다
		Arrays.sort(nums);
 		int index = Arrays.binarySearch(nums, 5);
 		System.out.println("5의 인덱스: " + index);
 		System.out.println("nums 배열:" + Arrays.toString(nums));
 		
 		String[] words = "Java C C++ Python Linux".split(" ");
 		//	words 배열 내부에서 Python 찾기
 		Arrays.sort(words);
 		index = Arrays.binarySearch(words, "Python");
 		
 		System.out.println("Python의 인덱스:" + index);
 		System.out.println(Arrays.toString(words));
	}
	
	public static void customClassSortEx() {
		//	Member의 배열을 만들고 배열을 정렬
		Member[] members = {
			new Member("홍길동"),
			new Member("장길산"),
			new Member("전우치")
		};
		System.out.println("원본 배열:" + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬된 배열:" + Arrays.toString(members));
	}
	
	public static void main(String[] args) {
//		arrayCopyEx();
//		sortEx();
//		binarySearchEx();
		customClassSortEx();

	}

}















