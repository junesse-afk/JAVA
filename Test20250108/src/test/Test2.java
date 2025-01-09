package test;

public class Test2 {

	public static void main(String[] args) {
		//클래스 Button
		// 안에 인터페이스 OnclickListener
		
		//클래스 CallListener 상속 Button 안에 있는 OnClickListener
		//메서드 오버라이딩 onClick() "전화를 겁니다"
		
		//클래스 MessageListener 상속 Button 안에 있는 OnClickListener
		//메서드 오버라이딩 onClick() "메세지를 보냅니다"
		
		Button button = new Button();
		button.setListener(new CallListener());
		button.touch();
		
		button.setListener(new MessageListener());
		button.touch();

	}

}
