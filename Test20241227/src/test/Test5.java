package test;

public class Test5 {

	public static void main(String[] args) {
		// 쓰레드 우선순위
		// - 쓰레드 우선순위 정수1(낮음) ~ 10(높음) 값을 가짐
		// - 자바는 기본적으로 우선순위(기본값 5)를 가짐
		// - 우선순위 확인 getPriority() / 변경 setPriority()
		// - 우선순위 낮은 쓰레드 동작할때 높은 쓰레드 계속 추가
		// - 경우에 따라 낮은 쓰레드 실행되지 못할수 있음
		// => 우선순위가 밀려서 실행되지 못하는 상태 
		//        Stravation 기아상태
		// => 해결 : 모든 쓰레드를 일정 시간 동안 멈추게 함
		//        sleep() 메서드를 활용하여 기아 상태 방지

		Thread mainThread = Thread.currentThread();
		System.out.println("시작 쓰레드 : " + mainThread.getName());
		
		Thread thread1 = new Thread(new MyThread2(10000, "A작업"));
		Thread thread2 = new Thread(new MyThread2(10000, "B작업"));
		Thread thread3 = new Thread(new MyThread2(10000, "C작업"));
		
		System.out.println("쓰레드1 : " + thread1.getName());
		System.out.println("쓰레드2 : " + thread2.getName());
		System.out.println("쓰레드3 : " + thread3.getName());
		
		//우선순위 확인
		System.out.println("main 우선순위 : " + mainThread.getPriority());
		System.out.println("쓰레드1 우선순위 : " + thread1.getPriority());
		System.out.println("쓰레드2 우선순위 : " + thread2.getPriority());
		System.out.println("쓰레드3 우선순위 : " + thread3.getPriority());
		
		//우선순위 변경
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread3.setPriority(5);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
