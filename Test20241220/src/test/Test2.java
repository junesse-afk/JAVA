package test;

public class Test2 {

	public static void main(String[] args) {
		
		//외부클래스 객체 생성
		OutClassMethod ocm = new OutClassMethod();
		
		//메서드 호출 => 지역클래스 객체생성 리턴
		//부모                자식
		Runnable runnable = ocm.getRunnable(10);
		
		//객체생성 리턴 받은 메서드 호출
		runnable.run();

	}

}
