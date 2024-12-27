package test;



public class Test1 {
	public static void main(String[] args) {
		//프로세스(Process)
		//프로세스는 프로그램에 사용되는 데이터와 메모리 등의 자원 그리고 스레드로 구성
		//프로그램이 실행하여 메모리에 로딩된 상태
		//예시 : 이클립스를 실행하면서 크롬을 실행하는 것
		//멀티태스킹은 프로세스 여러개가 사용되는거 말함
		
		//쓰레드(Thread)
		//프로세스 내에서 실제로 작업을 수행하는 주체를 의미
		//프로세스 안에 한 개 이상의 쓰레드가 존재하여 작업을 수행
		//두 개 이상의 쓰레드를 가지는 프로세스를 멀티쓰레드 프로세스
		//예시 : 웹 애플리케이션 서버(톰캣), 메신저(메시지 송신, 수신 동시에 수행)
		
		//싱글쓰레드(Single Thread)
		//NoThread 클래스 정의
		//객체 생성
		//메서드 호출
		NoThread nt = new NoThread(5, "A작업");
		NoThread nt2 = new NoThread(10, "B작업");
		NoThread nt3 = new NoThread(7, "C작업");
		
		nt.run();
		nt2.run();
		nt3.run();
	}

}
