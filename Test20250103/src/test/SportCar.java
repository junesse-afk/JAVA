package test;

public class SportCar extends Car {

	// SportCar클래스 정의
	// 상속 Car
	// 메서드 오버라이딩 speedUp() 10증가,
	//                 stop() "스포츠카 멈춤", speed = 0
	
	@Override
	public void speedUp() {
		speed += 10;
	}

	@Override
	public void stop() {
		System.out.println("스포츠카 멈춤");
		speed = 0;
	}

	
	
}
