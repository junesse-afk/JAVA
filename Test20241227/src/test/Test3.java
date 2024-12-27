package test;

public class Test3 {

	public static void main(String[] args) {
		
		//MyThread2 mt1 = new MyThread2(10, "A작업");
		//MyThread2 mt2 = new MyThread2(2, "B작업");
		//MyThread2 mt3 = new MyThread2(6, "C작업");
		//mt1.start();
		//멀티쓰레드 시작 => start() 에러 발생
		
		Thread thread1 = new Thread(new MyThread(10, "A작업"));
		Thread thread2 = new Thread(new MyThread2(6, "B작업"));
		Thread thread3 = new Thread(new MyThread2(8, "C작업"));
		
		//멀티쓰레드 시작
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
