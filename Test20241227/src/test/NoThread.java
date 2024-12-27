package test;



public class NoThread {
	//멤버변수 정수형 count, 문자열 data
	int count;
	String data;
	
	//생성자 count, data 받는 생성자
	public NoThread(int count, String data) {
		this.count=count;
		this.data=data;
	}
	
	//메서드 리턴값없는 run() for 1~ count 반복 출력
	public void run() {
		for(int i = 0; i < count; i++) {
		 System.out.println(i + " : "+ data);
		}
	}
}
