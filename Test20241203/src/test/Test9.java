package test;

public class Test9 {
	
	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		
		System.out.println("프로그램 시작");
		try {
			System.out.println(a/b);
			//예기치 못한 오류 발생 가능성이 높은 코드(명령)
		} catch (Exception e) {
			//예외가 발생하면 처리작업
			System.out.println("0으로 나눔");
		}
		System.out.println("프로그램 끝");
		System.out.println("----------------------");
		Student student = null;
		System.out.println("프로그램 시작");
		try {
			//예외발생 가능성이 높은 명령 =? 자바예외처리 구문
			System.out.println(student.getName());
		} catch (Exception e) {
			//Exception은 모든 예외를 처리
			e.printStackTrace();
		}
		System.out.println("프로그램 끝");
	}

}
