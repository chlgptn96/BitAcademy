package com.bit.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		Dog d = new Dog("Snoopy");
		d.walk();
		d.eat();
		d.bark();
		
		Animal pet = d;	//	Upcasting
		//	자식 인스턴스를 부모 클래스 타입으로 참조하는 것
		pet.walk();
		pet.eat();
		//pet.bark();	//	할 수 없어요.
		
		pet = new Cat("아즈라엘");
		pet.walk();
		pet.eat();
		
		//	다운 캐스팅
		//		부모 타입으로 참조하고 있는 것을
		//		다시 원래 클래스 타입으로 돌려 놓는 것
		((Cat)pet).meow();
		
		//	다운 캐스팅할 경우,
		//		해당 인스턴스가 특정 클래스의 객체인지를 확인
		if (pet instanceof Dog) {	//	pet이 Dog의 인스턴스인지 확인
			((Dog)pet).bark();
		} else {
			System.out.println("개 아닌데요!");
		}

	}

}






