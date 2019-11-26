package com.bit.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();	//	사용자 정의 생성자 있어서
									//	컴파일러가 기본 생성자를 끼워넣지 않음
		//	생성자를 이용한 초기화
		Goods camera = new Goods("Samsung", 400000);
		camera.showInfo();
		
		Goods notebook = new Goods("LG 그램", 900000);
		notebook.showInfo();
		
//		notebook.setPrice(9000);	// price 필드는 Read Only
//		notebook.showInfo();
	}

}
