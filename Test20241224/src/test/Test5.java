package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test5 {

	public static void main(String[] args) {
		//보조 스트림
		//입력 => Buffered 스트림 모아서 사용
		//Buffered 스트림 모아서 => 출력
		
		long millisecond = 0;
		
		try {
			FileInputStream fileInputStream = new FileInputStream("Test20241220.zip");
			
			FileOutputStream fileOutputStream = new FileOutputStream("copy.zip");
			
			BufferedInputStream bis = new BufferedInputStream(fileInputStream);
			
			BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
			
			//현시간
			millisecond = System.currentTimeMillis();
			
			int i;
			while ((i = bis.read()) != -1 ) {
				bos.write(i);
			}
			//동작 후 시간
			millisecond = System.currentTimeMillis() - millisecond;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사는데 " + millisecond + " milliseconds 소요되었습니다.");
	}

}
