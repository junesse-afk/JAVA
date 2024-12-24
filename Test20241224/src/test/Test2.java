package test;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		//p512 자바 입출력
		//자바 : 외부 장치에 따라 독립적이고 효율적인 입출력 기능 제공
		//    : 입출력은 스트림(stream)을 통해서 이루어짐
		//    : 입출력 장치와 무관하고 일관성 있게 프로그램을 구현
		//    : 가상 통로 => 스트림 제공
		//    : 키보드, 모니터, 파일 디스크, 메모리 입출력, 네트워크
		//    => 스트림 클래스 제공
		//    => package java.io;
		
		//1) 입력스트림 
		//=> FileInputStream(바이트단위처리), FileReader(문자단위처리),
		//   BufferedInputStream(바이트단위처리), BufferedReader(문자단위처리)
		
		//2) 출력스트림
		//=> FileOutputStream(바이트단위처리), FileWriter(문자단위처리),
		//   BufferedOutputStream(바이트단위처리), BufferedWriter(문자단위처리)
		
		// 보조 : 부가 기능 제공
		//InputStreamReader, OutputStreamReader,
		//BufferedInputStream, BufferedOutputStream
		
		//p515 1. 표준 입출력
		//PrintStream out 표준출력 스트림
		//InputStream in 표준입력 스트림
		//OutputStream err 표준오류입출력 스트림
		
		//바이트입력
//		try {
//			System.out.println("입력 : ");
//			int i = System.in.read();
//			System.out.println("출력 : ");
//			System.out.println(i);
//			System.out.println((char)i);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//while 반복하면서 문자 여러개 입력 => Enter키를 누르면 false종료
		
//		int i;
//		System.out.println("입력 : ");
//		try {
//			while((i = System.in.read()) != '\n') {
//				System.out.print((char)i);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//Scanner 클래스 => java.util 입력클래스
		//문자, 정수, 실수 .. 자료형 읽을 수 있음
		//콘솔화면, 파일, 문자열 생성자 자료를 읽어옴
		//nextLine, nextBoolean(), nextIN(), nextDouble()...
		//문자열 Line
		//정수 Int
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println("직업 : ");
		String job = scanner.nextLine();
		System.out.println("사번 : ");
		int num = scanner.nextInt();
		System.out.println("--------------------scanner");
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
	}

}
