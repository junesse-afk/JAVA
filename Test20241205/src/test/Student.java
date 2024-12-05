package test;

public class Student extends Person {
	
	public Student() {
		
	}
	
	public Student(String name) {
		//부모의 기본생성자 호출
		super("홍길동");
		System.out.println("자식의 기본 생성자");
	}
	
	public void studentPrn() {
		//부모의 메서드 호출
		System.out.println("학생이 공부한다");
		super.personPrn();
	}
	
}
