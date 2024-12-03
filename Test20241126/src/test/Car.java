package test;

public class Car {

	String carName;
	int speed;
	
	public Car() {
		carName = "국산차";
		speed = 10;
	}
	
	public int speedUp(int s) {
		speed += s;
		return speed;
	}

	public int speedDown(int s) {
		speed -= s;
		return speed;
	}


}
