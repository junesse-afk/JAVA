//폴더(패키지) 폴더이름 > test;
package test;

//접근제어자 > public > 모든 외부에서 접근할 수 있는 클래스
//프로그램단위 > class
//이름 { 멤버변수;, 메서드(); }


public class Student {
		//클래스 : 학생 객체(주제) 정의
		//클래스 이름 작성 규칙
		// - 대문자로 시작(소문자 오류안남, 개발자들의 사이의 규칙)
		// - 영문자
	
		//멤버변수;(학생의 특징을 저장하는 변수)
		//학생번호, 학생이름, 국어점수, 영어점수, 수학점수
		// 접근제어자 자료형 변수명; 선언(초기값을 자동으로 저장0, null)
		public int num = 1;
		public String name;
		public int kor = 90;
		public int eng = 80;
		public int math = 70;
	
		//멤버함수(메서드)(); : 학생 관련 기능을 정의하는 함수
//		public 리턴할형 또는 void 함수이름(전달받은 값을 저장하는 변수) {명령;
//		리턴할 값 도는 생략;}
		
		public void prn() {
			for(int i=0; i<10; i++) {
				num+=i;
				System.out.println(num);
			}
			
			return;
			
		}
		
		public int sum() {
			int s = 0;
			s=kor+eng+math;
			return s;	
		}
		
		
}
