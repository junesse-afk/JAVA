package test;

import test.Button.OnClickListener;

public class Window {

	Button button1 = new Button();
	Button button2 = new Button();
	
	OnClickListener listener = new OnClickListener() {
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	 // 익명 클래스 : 클래스 정의와 객체화를 동시에. 일회성으로 사용
	public Window() {
		button1.setListener(listener);
		button2.setListener(new OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다");
			}
		});
	}
	
	
}
