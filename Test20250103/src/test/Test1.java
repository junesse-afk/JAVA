package test;

public class Test1 {

	public static void main(String[] args) {
		
		//final 1)클래스 : 상속 못하게 막아줌
		//      2)메서드() : 메서드 오버라이딩(재정의) 못하게 막아줌
		//      3)멤버변수 : 변수 값을 변경 못하게 막아줌(초기값 무조건 할당)
		//        상수변수 : static final 변수
		
		SportCar sportCar = new SportCar();
		sportCar.speedUp();
		System.out.println("speed = " + sportCar.speed);
		sportCar.stop();
		System.out.println("speed = " + sportCar.speed);
		

	}

}
