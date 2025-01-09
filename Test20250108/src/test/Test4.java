package test;

public class Test4 {
	
	public static void main(String[] args) {
		//remoteControl 인터페이스
		//추상메서드 turnOn()
		//추상메서드 turnOff()
		
		//Anonymous2 클래스 정의
		//부모 인터페이스 변수 field = new 부모인터페이스(){}
		//turnOn "TV를 켭니다"
		//turnOff "TV를 끕니다"
		
		//method1() 메서드
		//부모인터페이스 변수 localVar = new 부모인터페이스(){}
		//turnOn "Audio를 켭니다"
		//turnOff "Audio를 끕니다"
		//localVar.turnOn() 메서드 호출
		
		Anonymous2 anoy = new Anonymous2();
		anoy.field.turnOn();
		anoy.field.turnOff();
		anoy.method1();
		
		anoy.method2(new remoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다");
				
			}
		});
		
	}

}
