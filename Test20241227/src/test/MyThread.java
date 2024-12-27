package test;

public class MyThread extends Thread{
	private int count;
	private String data;
	
	public MyThread(int count, String data) {
		this.count=count;
		this.data=data;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<=count; i++) {
			System.out.println(i + " : " +data);
		}
	}
}
