package test;

public class MyThread2 implements Runnable {
	private int count;
	private String data;
	
	public MyThread2(int count, String data) {
		this.count=count;
		this.data=data;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<=count; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i + " : " +data);
		}
			
		
	}
}
