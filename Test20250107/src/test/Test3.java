package test;

public class Test3 {

	public static void main(String[] args) {
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
		
		//클래스 Television 상속(구현) RemoteControl
		//멤버변수 int volume 정의
		//메서드 강제적으로 재정의
		//turnOn() "TV를 켭니다"
		//turnOff() "TV를 끕니다"
		//setVolume(int volume)
		//if volume > MAX_VOLUME 비교 volume = MAX_VOLUME
		// else if volume < MIN_VOLUME 비교 volume = MIN_VOLUME
		// else volume = volume
		// 출력 현재 TV 볼륨 : volume
		
		//Television 객체생성, 메서드 호출
		
		Television television = new Television();
		television.setVolume(10);
		television.turnOn();
		television.turnOff();
		television.search("www.naver.com");
		
		//Audio 객체 생성, 메서드 호출
		
		Audio audio = new Audio();
		audio.setVolume(5);
		audio.turnOn();
		audio.turnOff();
		audio.search("www.daum.net");

		//부모 = 자식 객체 생성, 메서드 호출
		
		RemoteControl remotecontrol = null;
		
		remotecontrol = new Television();
		remotecontrol.setVolume(7);
		remotecontrol.turnOn();
		remotecontrol.turnOff();
		
		remotecontrol = new Audio();
		remotecontrol.setVolume(10);
		remotecontrol.turnOn();
		remotecontrol.turnOff();
		
		Searchable searchable = new Television();
		searchable.search("TV");
		
		searchable = new Audio();
		searchable.search("AUDIO");
		
		//인터페이스 다중 상속 가능
		//인터페이스 Searchable 정의
		//추상메서드 리턴값 없음 search(String url) 정의
		//TV, Audio에 Searchable 상속(구현)

	}

}
