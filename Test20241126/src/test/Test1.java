package test;

public class Test1 {

	public static void main(String[] args) {
		// Car 클래스 정의
		// 멤버변수 carName, 정수형 speed,
		// 기본생성자 => 자동으로 만들어짐
		//         => 정의해서 carName = "국민차"
		//         => speed = 10;
		// 메서드()  => speedUp(속도를 전달 받는 변수) 정의
		//            speed 속도를 증가하고 리턴
		//         => speedDown(속도를 전달 받는 변수) 정의
		//            speed 속도를 감소하고 리턴


		Car c = new Car();
		System.out.println("차 이름 : " + c.carName);
		System.out.println("차 속도 : " + c.speed);
		System.out.println("차 속도 증가 : " + c.speedUp(5));
		System.out.println("차 속도 감소 : " + c.speedDown(10));
	}

}
