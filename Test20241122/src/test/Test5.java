package test;

public class Test5 {

	public static void main(String[] args) {
		//Car c = new Car(); 기본생성자 호출
		
		//Car c = new Car("기아자동차", "K5", 200);
		//에러나는 이유가 멤버변수 저장을 아직 안해서?
		
		Car c = new Car("기아자동차", "K5", 2000);
		c.run();

		Student s = new Student(1, "홍길동", 100, 80, 60, 70);
		s.intro();
	}

}
