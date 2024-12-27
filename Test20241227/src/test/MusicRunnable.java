package test;

public class MusicRunnable implements Runnable {
	private int count;
	private String data;
	
	public MusicRunnable(int count, String data) {
		this.count=count;
		this.data=data;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<=3; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i + "음악을 재생합니다");
		}
		
	}

}


