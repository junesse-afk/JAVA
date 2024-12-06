package test;

import COM.P2.father;
import COM.P3.child;

public class Test1 {

	public static void main(String[] args) {
		//조상 클래스 패키지 p1 할아버지.java
		//메서드 노래하기() 출력 "노래를 한다"
		
		//조상 클래스 패키지 p2 아버지.java /할아버지 상속
		//메서드 일하기()출력 "일을 한다"
		
		//조상 클래스 패키지 p3 자식.java /아버지 상속
		//메서드 게임하기() 출력 "게임을 한다"
		//노래하기()메서드 오버라이딩(재정의)
		
		father ft = new father();
		ft.sing();
		ft.job();
		System.out.println("-------------------");
		child ch = new child();
		ch.sing();
		ch.job();
		ch.game();

	}

}
