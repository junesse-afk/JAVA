package test;

public class Test1 {

	public static void main(String[] args) {
		//Widow 클래스 정의
		//Button button1 객체 생성
		
		//멤버변수 OnClickListener listener = new 익명객체 생성
		//onClick() "전화를 겁니다"
		
		//window()생성자
		//button1.setOnClickListener(listener) 메서드 호출
		//button2.setOnClickListener(new 익명객체)메서드 호출
		//onClick() "메세지를 보냅니다"
		
		//widow 객체 생성
		//button1.touch() 메서드 호출
		//button2.touch() 메서드 호출
		
		Window window = new Window();
		window.button1.touch();
		window.button2.touch();
		
		
	}

}
