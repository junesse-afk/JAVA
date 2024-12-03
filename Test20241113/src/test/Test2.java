package test;

public class Test2 {

	public static void main(String[] args) {
		// 자바 프로그램 단위 class (주제, 객체)
		// => 요소 : class의 멤버변수, class의 멤버함수(), 메서드()
		
		//변수 : 변하는 수, 기억장소 이름을 부여 값을 저장
		//변수 사용 : 이름을 불러서 기억장소에 저장된 값을 사용
		int a = 100;
		int b = 200;
		System.out.println(a+b);
		
		cal(10, 20); //함수 이름을 호출
		
	} //main()
	//개발자가 개발한 매서드(함수) 정의
	
	public static void cal(int a, int b) {
		
		System.out.println(a+b);
		System.out.println(a-b);
	}

} //class
