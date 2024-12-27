package test;

public class MovieThread extends Thread {

	private int count;
	private String data;
	
	public MovieThread(int count, String data) {
		this.count=count;
		this.data=data;
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i + "동영상을 재생합니다");
		}
	}
}
