package test;

public class CarTest {

	public static void main(String[] args) {
		//p.288
		//Car 추상클래스
		//run() 추상메서드()
		//refuel() 추상메서드()
		//stop() 일반메서드
		
		//Bus 자식클래스 상속 Car
		//takePassenger() 일반메서드
		//추상메서드 재정의
		//AutoCar 자식클래스 상속 Car
		//load() 일반메서드
		
		Car car = new Bus();
		car.run();
		car.refuel();
		car.takePassenger();
		car.stop();
		System.out.println("--------------------");
		
		car = new AutoCar();
		car.run();
		car.refuel();
		car.load();
		car.stop();
		

	}

}
