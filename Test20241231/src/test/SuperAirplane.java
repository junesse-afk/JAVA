package test;

public class SuperAirplane extends Airplane {
	public static final int NOMAL = 1;
	public static final int SUPER = 2;
	int flyMod = NOMAL;
	
	@Override
	public void fly() {
		Airplane ap = new Airplane();
		
		if (flyMod == SUPER) {
		System.out.println("초고속 비행입니다");
		} else {
			ap.fly();
		}
	}
}
