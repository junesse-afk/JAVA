package test;

public class Test3 {
int a = 100; //멤버변수
static int b = 200;
	public static void main(String[] args) {
		// 1)지역변수(로컬변수, 매게변수, 참조변수)
		// : 메서드 내에서 정의하고 사용
		// : 메서드 밖에서는 사용 못함
		// : 스택 기억장소에 저장됨
		// => 메서드 호출되면 사용리턴하면 기억장소 사라짐
		
		int a = 10;
		System.out.println(a);
		// 2)멤버변수(인스턴스변수) [클래스안에 존재]
		// 클래스 안에 정의된 변수(인스턴스 변수)
		// 객체를 생성해야지만 사용할 수 있는 변수
		// 힙 기억장소(동적 기억장소)에 생성
		// => garbage Collector 메모리 수거(기억장소 해제)
		// 인스턴스변수 => new 객체 생성해서 사용
		Test3 test3 = new Test3();//객체생성
		System.out.println(test3.a);
		// 3)static변수(클래스 변수)
		// 사용자가 프로그램을 실행하면 메모리에 상주하여
		// 메모리 데이터 영역에 상수, 문자열, static 변수 생성
		System.out.println(b);
	}

}
