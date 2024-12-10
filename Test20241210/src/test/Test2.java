package test;

public class Test2 {

	public static void main(String[] args) {
		// 추상클래스 AbsShape
		// 추상메서드 public void prn(){
		// 일반메서드 method() "AbsShape 추상클래스 일반메서드()" 출력
		
		// 자식클래스 CircleA 상속 AbsShape
		// 추상메서드 => 추상메서드 구현(메서드 오버라이딩) 원을 그린다
		
		// 자식클래스 TriA 상속 AbsShape
		// 추상메서드 => 추상메서드 구현(메서드 오버라이딩) 삼각형을 그린다
		
		// 자식클래스 RecA 상속 AbsShape
		// 추상메서드 => 추상메서드 구현(메서드 오버라이딩) 사각형을 그린다

		AbsShape absShape = new CircleA();
		absShape.prn();
		absShape.method();
		System.out.println("----------------------");
		
		absShape = new TriA();
		absShape.prn();
		absShape.method();
		System.out.println("----------------------");
		
		absShape = new RecA();
		absShape.prn();
		absShape.method();
		System.out.println("----------------------");
		
		
		
	}

}
