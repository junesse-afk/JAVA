package test;

public class Test4 {

	public static void main(String[] args) {
		//p461 람다식 : 함수형 프로그래밍
		// 기존 방식 : 클래스 > 메서드  > 메서드 호출 /클래스가 없다면 메서드 사용 불가
		System.out.println("리턴 값 : " + add(10, 20));		
		// 람다식 : 함수 구현(함수 이름이 없는 익명함수)과 호출만으로 프로그램을 만들 수 있는 방식
		// 문법 : (매개변수) -> {실행문;}
		// interface 클래스 정의한 후
		
		MyTest myTest = (x, y) -> {return x + y;};
		MyTest myTest2 = (x, y) -> x + y;
		System.out.println("람다 함수 호출 : " + myTest.add(100, 200));
		System.out.println("람다 함수 호출2 : " + myTest2.add(300, 400));
		
		// 매개변수가 1개일때 생략 가능, 리턴문이 1개일 때 생략 가능, {} 실행문 1개 일 경우 생략 가능
		// 중괄호 안의 구현 부분이 한 문자이더라도 return문은 중괄호를 생략할 수 없음
		
		// 함수프로그램(람다함수) : 자료를 입력 받아서 구현하므로 외부 자료에 영향을 미치지 않아서
		// 여러 자료를 동시에 처리하는 병렬 처리 방식에 적합
		
		System.out.println("------------------------------------");

		System.out.println(strlen("A"));
		
		MyTest2 myTest3 = str -> {return str.length();};
		System.out.println(myTest3.strlen("ABCD"));
		
		System.out.println("------------------------------------");
		
		System.out.println(max(10, 20));
		
		MyTest3 myTest4 = (int a, int b) -> (a >= b) ? a : b;
		System.out.println(myTest4.max(20, 30));
	}
	
	//두 수를 받아서 두 수를 더하는 add 함수(메서드) 리턴 두수의 합
	public static int add(int x, int y) {
		return x + y;
	}
	
	//하나의 문자열 길이를 리턴하는 strlen() 함수
	public static int strlen(String str) {
		return str.length();
	}
	
	//두 수를 비교해서 최대값 구하는 함수 리턴 최대값
	
	public static int max(int a, int b) {
		if ( a >= b ) {
			return a;
		} else {
			return b;
		}
	}
}
