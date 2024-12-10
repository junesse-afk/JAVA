package test;

public class Test1 {

	public static void main(String[] args) {
		//클래스(클래스) public class int xxx { }
		// : 객체 생성 할 수 있음(마음대로 객체생성 가능 부모 = 자신, 본인 = 본인)
		// : 단일 상속(extends, 확장)
		
		//추상클래스(클래스 + 추상틀)
		// : abstract class (일반 메서드 + 추상 메서드(강제적 오버라이딩))
		// : 객체생성 할 수 없음 (부모추상클래스 = 자식클래스) 강제적 업캐스팅
		// : 상속, 추상화, 업캐스팅, 다형성, 메서드 오버라이딩 적용
		// : 단일 상속(extends, 확장 + 틀 구현)
		
		//인터페이스(추상틀)
		// : abstract interface (추상메서드(강제적 오버라이딩))
		// : 객체생성 할 수 없음 (부모추상인터페이스 = 자식클래스) 강제적 업캐스팅
		// : 상속, 추상화, 업캐스팅, 다형성, 메서드 오버라이딩 적용
		// : 다중 상속(implements, 틀 구현)
		// : 인터페이스 상수변수
		
		//final : 수정 못하게 막아주는 역할
		
		//p.281 추상클래스
		// 접근제어자 + 추상 + 클래스 + 클래스 이름 {}
		// public abstract class abs {}
		// 추상클래스 AbsAnimal
		// 멤버변수 String name
		// 메서드() prn() "추상클래스 일반 메서드" 출력
		// 추상메서드() => 메서드 틀 => {}구현 없음
		// public abstract void 또는 int move();
		
		//AbsAnimal 객체생성
		//AbsAnimal absAnimal = new AbsAnimal(); => 에러발생
		//추상 클래스는 인스턴스(객체)를 생성할 수 없음
		//부모 추상클래스 = 상속받은 자식클래스 객체 생성 (업캐스팅)
		
		AbsAnimal absAnimal = new EagleA();
		absAnimal.move();
		absAnimal.prn();
		
		EagleA e = new EagleA();
		e.move();
		e.prn();
	}

}
