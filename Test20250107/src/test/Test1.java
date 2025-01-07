package test;

public class Test1 {

	public static void main(String[] args) {
		//추상화(클래스를 만들기 위한 부모틀)
		//부모 : 추상클래스, 인터페이스 (부모의 공통적인 틀)
		//자식 : 추상클래스, 인터페이스 구현(상속) 클래스
		
		//Phone 추상클래스
		//멤버변수 문자열 owner
		//owner 받는 생성자
		//turnOn() 폰 전원을 켭니다 메세지 출력
		//turnOff() 폰 전원을 끕니다 메세지 출력

		SmartPhone smartPhone = new SmartPhone("홍길동");
		System.out.println(smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.sound();
		smartPhone.turnOff();
		System.out.println("----------------------------");
		
		//부모 = 자식(업캐스팅)
		Phone phone = new SmartPhone("이길동");
		System.out.println(phone.owner);
		phone.turnOn();
		phone.sound();
		phone.turnOff();
		System.out.println("----------------------------");
		
		//자식 = 업캐스팅된 부모(다운캐스팅, 명시적 형변환)
		SmartPhone smartPhone2 = (SmartPhone)phone;
		System.out.println(smartPhone2.owner);
		smartPhone2.turnOn();
		smartPhone2.internetSearch();
		smartPhone2.sound();
		smartPhone2.turnOff();
		
	}

}
