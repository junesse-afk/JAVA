package test;

import java.io.File;
import java.io.IOException;

public class Test6 {

	public static void main(String[] args) {
		//File 클래스 => File 생성, 정보확인, 삭제
		
		try {
			File file = new File("D:\\Person\\java\\Test20241224\\newFile.txt");
			//파일생성
			file.createNewFile();
			
			System.out.println("파일 : " + file.isFile());
			System.out.println("디렉토리 : " + file.isDirectory());
			System.out.println("파일이름 : " + file.getName());
			System.out.println("파일절대경로 : " + file.getAbsolutePath());
			System.out.println("파일경로 : " + file.getPath());
			System.out.println("파일읽기 : " + file.canRead());
			System.out.println("파일쓰기 : " + file.canWrite());
			System.out.println("파일존재 : " + file.exists());
			
			//파일삭제
			file.delete();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
