package test;

public class Test8 {

	public static void main(String[] args) {
		//p487 예외 클래스 : 자바로 만든 내장객체(API)
		
		//오류 : 문법오류, 실행오류(시스템적 문제)
		//Int a = 10; <-문법오류
		
		//예외 : 예기치 못한 오류 발생
		//System.out.println(10/0);
		
		//예외처리 : 예외발생 시 처리하는 구문이용해서 처리
		
		int a= 1;
		int b = 0;
		
		System.out.println("프로그램 시작");
		if(b!=0) {
			System.out.println(a/b);
		} else {
			//예외발생 => 예외처리작업
			System.out.println("0으로 나눔");
		}
		
//		System.out.println("프로그램 시작");
//		Student student = null;
//		System.out.println(student.getName());
//		System.out.println("프로그램 끝");
		

	}

}
