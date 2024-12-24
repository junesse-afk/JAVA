package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {

	public static void main(String[] args) {
		//p521 바이트 단위 입력
		FileInputStream fileInputStream = null;
//		try {
//			fileInputStream = new FileInputStream("input.txt");
//			System.out.println((char)fileInputStream.read());
//			System.out.println((char)fileInputStream.read());
//			System.out.println((char)fileInputStream.read());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//바이트단위 출력
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("output.txt");
			fileOutputStream.write(65);
			fileOutputStream.write(66);
			fileOutputStream.write(67);
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}
