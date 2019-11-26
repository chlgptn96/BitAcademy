package com.bit.javaex.api.stringclass;

public class StringEx {
	public static void stringBasic() {
		//	문자열의 생성
		//	문자열 : char 형 데이터가 여러개 연속으로 연결된 자료
		//		* 한번 생성되면 변경되지 않는다 (중요)
		String s1 = "Java";	//	Literal -> 실제 소스 코드에 직접 입력한 문자열
		String s2 = new String("Java");	//	메모리에 새로 생성된 문자열
		String s3 = "Java";	//	Literal
		//	Literal 문자열은 값이 같으면 같은 객체다 
		
		System.out.println(s1 == s2); //	s1과 s2는 같은 객체인가?
		System.out.println(s1 == s3); //	s1과 s3는 같은 객체인가?
	
		//	문자열은 char 형의 집합이기 때문에 char의 배열로 문자열을 생성할 수 있다
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		System.out.println(s4);	//	char 배열로 만들어진 문자열
		
		//	기본 데이터형 자료가 있을 때 -> 문자열로 변경 (valueOf 메서드)
		String s5 = String.valueOf(3.14159);
		System.out.println(s5);
	}
	
	public static void methodsEx() {
		//	String의 유용한 메서드들
		String str = "Java Programming is Fun?";
		
		//	길이 : .length() 메서드
		System.out.println("length:" + str.length());
		
		//	변환 메서드 
		System.out.println("UPPERCASE:" + str.toUpperCase());
		System.out.println("LOWERCASE:" + str.toLowerCase());
		//	문자열은 변경 불가 자료이기 때문에 변환 메서드를 사용해도
		//		원본은 바뀌지 않으므로 새로 할당 받아야 한다
		
		//	검색 관련 메서드
		System.out.println("contains:" + str.contains("Java"));
		
		//	5번 인덱스의 char는 무엇인가?
		System.out.println("charAt:" + str.charAt(5));
		System.out.println("indexOf:" 
				+ str.indexOf("Fun")); // 문자열 내부에서 Fun의 index 반환
		System.out.println("lastIndexOf:" 
				+ str.lastIndexOf("Fun")); // 검색 방향이 반대
		System.out.println("없는 검색어의 인덱스:"
				+ str.indexOf("fun"));	
		
		String str2 = "I Like Java, I Like Python";
		int i = str2.indexOf("Like"); // str2 내의 Like의 위치(인덱스)
		System.out.println("Like index:" + i);
		i += "Like".length();
		i = str2.indexOf("Like", i); // 두 번째 인자는 검색 시작 위치
		System.out.println("Like 2nd index:" + i);
		
		// 문자열 추출: substring
		//	str로부터 Programming 문자열 추출
		System.out.println("substring:" + str.substring(5, 16));
		//	두번째 인자값은 endIndex인데 endIndex 직전까지 추출
		//	str로부터 5번 인덱스부터 끝까지 -> endIndex 생략 가능
		System.out.println("substring 끝까지:"
				+ str.substring(5));	//	시작 인덱스만 부여
		
		//	치환 메서드 : replace 
		//	str2 : I Like Java, I Like Python
		//	str2의 Like를 -> like로 변환
		System.out.println(str2.replace("Like", "like"));
		
		//	공백 문자 제거 : trim()
		String str3 = "        Hello    ";
		str3 = str3.trim(); //공백 문자 제거
		System.out.println("trim:" + str3);
		
		//	문자열 분리 : split()
		String[] chunks = str.split(" ");	//	공백 문자를 기준으로 분리 -> 문자열 배열로 생성
		
		for (String word: chunks) {
			System.out.println("word:" + word);
		}
	}
	
	public static void stringBufferEx() {
		//	String 버퍼는 내부에 버퍼(임시 공간)을 가지고 있는 자료형
		//		String 객체가 매번 새 객체를 생성하는데 반해
		//		StringBuffer는 내부 버퍼에서 모든 작업을 수행한다
		//		메모리 효율이 좋다
		//	This is my pencil
		StringBuffer sb = new StringBuffer("This");
		//	뒤에 문자열 추가 : .append()
		sb.append(" is pencil"); //	문자열 추가(맨 뒤에)
		sb.insert(8, "my");	//	문자열의 삽입(중간에)
		sb.replace(8, 10, "your ");	//	문자열의 변경
		
		System.out.println(sb);
		
		//	메서드 체이닝
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is")
				.append(" pencil")
				.insert(8, "my")
				.replace(8, 10, "your ");
		String s = sb2.toString();	//	문자열로 최종 변환
		System.out.println(s);
	}
	
	public static void main(String[] args) {
//		stringBasic();
//		methodsEx();
		stringBufferEx();

	}

}


















