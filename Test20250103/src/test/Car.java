package test;

public  class Car { //final class 상속안됨
	
	// Car클래스 정의
	// 멤버변수 정수형 speed
	// 메서드() speedUp() speed 1씩 증가
	// 메서드() stop() 차를 멈춤, speed=0 변경
	// stop() 메서드는 메서드 오버라이딩 못하게 정의
	
	int speed; //final 값 변경 불가
	
	public void speedUp() {
		speed += 1;
	}
	
	public void stop() { //final 메서드 오버라이딩(재정의) 못하게 막아줌
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
