package test;

public class AutoCar extends Car {

	@Override
	public void run() {
		System.out.println("차가 달립니다");
		
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다");
		
	}

}
