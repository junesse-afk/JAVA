package test;

public class OutClassMethod {
	
	//외부클래스 메서드 안에 클래스 정의 사용
	//지역 내부 클래스 정의
	
	private int outNum = 10;
	private static int sNum = 20;
	
	//메서드
	Runnable getRunnable(int i) {
		//지역 변수
		int num = 100;
		
		//지역 내부 클래스
//		class MyRunnable implements Runnable {
//			
//			//클래스안에? 멤버 변수
//			int localNum = 10;
//			
//			//Runnable 인터페이스를 재정의한 메서드
//			@Override
//			public void run() {
//				System.out.println("i = " + i);
//				System.out.println("num = " + num);
//				System.out.println("localNum = " + localNum);
//				System.out.println("outNum = " + outNum);
//				System.out.println("sNum = " + OutClassMethod.sNum);
//			}
//			
//		}
//		return new MyRunnable(); //객체를 생성해서 리턴해줌
		
		return new Runnable() {
			
			int localNum = 10;
		
			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum);
				System.out.println("OutClassMethod.sNum = " + OutClassMethod.sNum);
			}
		};
	} //메서드가 끝나는 부분
	
	//익명 내부 클래스 => 변수에 대입
	//자바 UI 이벤트, 안드로이드 위젯(UI) 이벤트 활용

		//변수               익명 내부 클래스
		Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable로 구현된 익명 클래스 메서드");
			
		}
	};
}
