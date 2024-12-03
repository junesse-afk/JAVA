package test;

public class Test3 {

	public static void main(String[] args) {
		//클래스 person
		//이름, 나이, 성별, 결혼여부, 자녀수
		//메서드() : prn() 출력 나이 : , 이름: , 성별 : , 결혼여부 : , 자녀수 : ,
		
		Person p1 = new Person();
		p1.name = "James";
		p1.age = 42;
		p1.gender = "man";
		p1.child = 3;
		
		p1.prn();
		
	}
}
