package test;

public class Person {
	
	// Person 클래스 정의
	// 멤버변수 name, float height, float weight
	
	public String name;
	public float height;
	public float weight;


	// 기본생성자 => 생략 가능, 다른생성자가 있으면 만들어 줘야함
	// 출력 "Person()기본생성자
	public Person() {
		name="홍길동";
		height=187.4f;
		weight=77.5f;
	}
	
	// 이름을 받아서 초기값 할당하는 생성자
	public Person(String name) {
		this.name = name;
	}
	// 키, 몸무게 받는 생성자
	public Person(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}

	// 이름, 키, 몸무게 받는 생성자
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	// 메서드() prn() 이름 : , 키 : , 몸무게 : 출력
	public void prn() {
		System.out.println("이름 : " + name + ", 키 : " + height + ", 몸무게 : " + weight);
	}
	
	
}



