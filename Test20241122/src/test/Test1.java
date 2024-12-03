package test;

public class Test1 {

	public static void main(String[] args) {
//		클래스 정의
//		Car 클래스 정의
//		=> 멤버변수
//		=> 메서드() run() "차가 달린다" 출력

//		Car 클래스 변수 선언 = new 객체생성(기억장소 할당, 초기값 할당)
//						   인스턴스화

//		메서드() 호출
		
//		Car 정의된 클래스(설계도)에 대한 객체(인스턴스) 생성
//		new Car() 메모리(힙 Heep)에 인스턴스 생성 => 주소 부여
//		주소값을 Car c1 참조변수에 저장
		
		Car c1 = new Car();
		System.out.println("Car 주소 : " + c1);
//		멤버변수 호출 값 저장, 출력
		c1.company = "aaa";
		System.out.println(c1.company);
		c1.model = "abc";
		System.out.println(c1.model);
		c1.price = 100;
		System.out.println(c1.price);
		c1.run();
		
		System.out.println("===========");
		
		Car c2 = new Car();
		c2.company = "bbb";
		System.out.println(c2.company);
		c2.model = "def";
		System.out.println(c2.model);
		c2.price = 200;
		System.out.println(c2.price);
		c2.run();
		
	}

}
