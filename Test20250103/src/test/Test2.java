package test;

public class Test2 {

	public static void main(String[] args) {
		//참조형의 형변환(부모 자식 상속관계)
		
		//자동 형변환 (부모 = 자식) 업캐스팅
		
		//명시적 형변환 (자식 = "업캐스팅된 부모"가 전제되어야함) 다운캐스팅
		
		
		//자식 = 부모인 상황에서 부모 앞에 cast를 붙여도 에러가 발생
		//SportCar sportCar = (SportCar) new Car(); 
		//sportCar.speedUp();
		//sportCar.stop();
		
		//부모 = 자식(업캐스팅)
		Car car = new SportCar();
		car.speedUp();
		System.out.println(car.speed);
		car.stop();
		System.out.println(car.speed);
		
		//자식 = 업캐스팅된 부모(다운캐스팅) 우선 업캐스팅을 먼저 써야함
		SportCar scar = (SportCar)car;
		scar.speedUp();
		System.out.println(scar.speed);
		scar.stop();
		System.out.println(scar.speed);
	}
	

}
