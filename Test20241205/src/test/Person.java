package test;

public class Person {

	public Person() {
		System.out.println("부모의 기본 생성자");
	}
	//왜 이건 못받아오지?
	public Person(String name) {
		System.out.println("부모의 값을 받는 기본 생성자");
	}
	
	public void personPrn() {
		System.out.println("사람이 밥을 먹는다");
	}
}
