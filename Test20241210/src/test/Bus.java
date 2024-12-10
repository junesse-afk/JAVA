package test;

public class Bus extends Car{
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
		
	}

	@Override
	public void refuel() {
		System.out.println("천연가스를 충전합니다");
		
	}
	
}
