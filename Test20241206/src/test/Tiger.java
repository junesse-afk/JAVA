package test;

public class Tiger extends Animal {
	//오버라이드 알트 쉬프트 s > v 단축키
	@Override
	public void move() {
		System.out.println("move() 호랑이 네발로 움직인다");
	}

	//부모의 메서드 재정의(수정)
//	public void move() {
//		//부모의 메서드 호출()
//		super.move();
//		System.out.println("move() 호랑이 네발로 움직인다");
//	}
	
	
	
	public void moveTiger() {
		System.out.println("moveTiger() 호랑이 네발로 움직인다");
	}
}
