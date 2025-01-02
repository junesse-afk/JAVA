package test;

public class Test2 {

	public static void main(String[] args) {
		// 싱글톤(하나의 객체) : 전체 프로그램에서 단 하나의 객체를 생성해서 사용
		//      : static 이용해서 객체 생성
		
		//싱글톤 패턴 : 객체지향프로그램에서 인스턴스를 단 하나만 생성하는 디자인패턴
		//디자인 패턴 : 객체지향프로그램에서 프로그램을 어떻게 구현해야 유연하고
		//            재활용성이 높은 프로그램을 만들 수 있는지 정리한 내용
		
		
		// Calendar 객체생성
		// Calendar calender = Calender.getInstance();
		// Calendar calendar2 = new Calendar(); //오류뜸
		
		//Singleton 클래스 정의
		//static Singleton 변수선언 = new Singleton 객체 생성
		//private 기본생성자
		//staitc Singleton 리턴 getInstance() 메서드

		//Singleton 2개 객체생성 => new 에러발생
		//Singleton 2개(s1, s2) 객체생성 => getInstance()
		//s1, s2 두개 비교 같으면 => "같은 Singleton 객체입니다"
		//s1, s2 두개 비교 틀리면 => "다른 Singleton 객체입니다"
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2) {
			System.out.println("같은 Singleton 객체입니다");
		} else{
			System.out.println("다른 Singleton 객체입니다");
		}
		
	}

}
