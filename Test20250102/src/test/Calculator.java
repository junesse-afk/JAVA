package test;

public class Calculator {
	//멤버변수[메서드안에 들어가는건 로컬변수]
	
	String color; //인스턴스 멤버변수
	static double pi; //스태틱(클래스, 정적)멤버변수
	//특징 1) 객체를 생성하지 않고 클래스.멤버변수 접근 바로해서 사용
	//특징 2) 클래스 단에 기억장소가 만들어짐 => 공용으로 기억장소 사용 
	
	//인스턴스 메서드 출력
	public void prn() {
		System.out.println(color + " : " + pi);
	}
	
	//스태틱 메서드 정의
	public static int plus(int x, int y) {
		//System.out.println(color + " : " + pi);
		return x+y;
	}
	
	//스태틱 메서드 정의
	public static int minus(int x, int y) {
		//System.out.println(color + " : " + pi);
		return x-y;
	}

}
