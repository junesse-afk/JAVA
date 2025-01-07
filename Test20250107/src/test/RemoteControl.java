package test;

public interface RemoteControl {
	
	// 인터페이스 RemoteControl
	// 멤버변수 => 무조건 객체 생성없이 사용하는 상수변수
	//        => static final 생략가능
	
	// MAX_VOLUME = 10 초기값
	// MIN_VOLUME = 0 초기값
	// 추상메서드 => 무조건 추상메서드만 있음
	//         => abstract 생략가능
	
	// 리턴값없음 turnOn()
	// 리턴값없음 turnOff()
	// 리턴값없음 setVolume(int volume)
	
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		
		public void turnOn();
		
		public void turnOff();
		
		public void setVolume(int volume);
}
