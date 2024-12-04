package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// 자바에서 제공하는 예외클래스
		// Throwable 안에 -> Error(java.lang.Error) 에러
		//              Exception (java.lang.Exception) 예외
		
		// Exception 안에 -> IOException -> FileNotFoundException <파일이 없는 경우>
		//               -> RuntimeException -> ArithmeticException <숫자 계산 오류>
		//                                   -> IndexOutofBoundException <범위가 넘어갔을때>
		
		int arr[] = new int[5];
		
		
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				//예외가 발생할 가능성이 높은 명령을 작성
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//Exception 파일
		} catch(Exception e) {
			
		} finally {
			//예외 발생 상관없이 마무리 작업하는 명령
			System.out.println("마무리작업");
		}
		
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("try이 안");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("마무리 작업 2");
			//기억장소 해제
			fis.close();
		}
		
	}
}
