package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	// throws : 예외처리를 메서드 호출한 곳에서 예외처리를 하도록 미룸(던짐)
	
		public void loadfile() {//throws //FileNotFoundException 
			System.out.println("예외 발생 메서드()");
			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream("a.txt");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
