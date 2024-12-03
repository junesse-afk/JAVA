package test;

public class Test3 {

	public static void main(String[] args) {
		// 회원가입
		// Member 클래스 정의
		// 멤버변수 id, pass, name, int age
		// 메서드() prn() 출력 아이디 : , 비밀번호 : , 이름 : , 나이 : , 출력
		// 생성자 => 기억장소 할당, 초기값 할당
		// 기본 생성자 => 0, null 기본 초기값 할당
		// id, pass, name, age 값을 받아서 멤버변수에 초기값 할당하는 생성자

		
		//프로그램에서 사용하는 메모리 : 스택, 힙, 데이터 3가지 영역 사용
		// 힙(heap)메모리 : 프로그램에서 사용하는 동적 메모리
		// 힙은 동적으로 할당되어 사용이 끝나면 동적 메모리 해제
		// => 가비지 컬렉터(garbage collector) 자동으로 메모리 해제
		
		Member m = new Member();
		m.prn();
		
		Member m2 = new Member("admin2", 5678, "LEE", 34);
		m2.prn();
		
	}

}
