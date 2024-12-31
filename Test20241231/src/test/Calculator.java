package test;

public class Calculator {
	//멤버변수
	private int memory;
	
	//메서드() getMemory()
	public int getMemory(){
		return memory;
	}
	
	//메서드() setMemory() => 동기화 메서드(임계영역)
	public synchronized void setMemory(int memory) {
		this.memory=memory;
		//쓰레드 2초간 일시 정지
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " : " + this.memory);
	}
	
}
