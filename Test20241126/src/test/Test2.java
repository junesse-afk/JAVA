package test;

public class Test2 {

	public static void main(String[] args) {
		// Person 클래스 정의
		// 멤버변수 name, float height, float weight
		// 메서드() prn() 이름 : , 키 : , 몸무게 : 출력
		// 기본생성자 => 생략 가능, 다른생성자가 있으면 만들어 줘야함
		// 출려 "Person()기본생성자
		// 이름을 받아서 초기값 할당하는 생성자
		// 키, 몸무게 받는 생성사
		// 이름, 키, 몸무게 받는 생성자

		Person p = new Person();
		p.prn();
		
		System.out.println(p.name);
		System.out.println(p.height);
		System.err.println(p.weight);
		
		
		Person p2 = new Person("이순신");
		p2.prn();
		
		Person p3 = new Person(177.5f, 88.2f);
		p3.prn();
		
		Person p4 = new Person("김태희", 167.3f, 44.5f);
		p4.prn();
	}

}
