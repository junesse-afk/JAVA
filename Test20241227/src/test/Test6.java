package test;

public class Test6 {

	public static void main(String[] args) {
		//MovieThread 클래스 만들기
		
		MovieThread thread1 = new MovieThread(1000, "A영화");
		Thread thread2 = new Thread(new MusicRunnable(1000, "B음악"));
	
		thread1.start();
		thread2.start();
		

	}

}
