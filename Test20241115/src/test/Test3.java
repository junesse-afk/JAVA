package test;

public class Test3 {

	public static void main(String[] args) {
		// hello(횟수 전달받은 정수형 변수선언) 함수 정의
		// 1~반복횟수 -> 1 hello world
		
		hello(10);
		
		// gugudan(몇단을 전달받은 정수형 변수선언) 함수 정의
		// for 전달 받은 단을 가지고 하나의 단을 출력
		// 리턴값 없음
		
		gugudan(2);
	}
	
	public static void hello(int x) {
	
		for (int i = 1; i <= x; i++) {
			System.out.println(i + " Hello World");
		} 
		return;
	}
	
	public static void gugudan(int y) {
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(y + " * "+ i +" = " + y * i);
		}
		return;
	}
	
}
