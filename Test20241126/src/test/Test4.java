package test;

public class Test4 {

	public static void main(String[] args) {
		// Board 클래스 정의
		// 멤버변수 int num, name, subject, content, int readcount 정의
		// 메서드() prn() 번호 : , 글쓴이 : , 제목 : , 내용 : , 조회수 : 출력
		
		// 기본생성자 => 0, null 기본 초기값 할당
		// 생성자 => 기억장소 할당, 초기값 할당
		// 자기자신 생성자 호출
		
		// 값을 받는 생성자 num, name, subject, content, readcount 값을 받아서
		// 멤버변수에 초기값 할당하는 생성자

		Board b = new Board();
		b.prn();
		
		Board b2 = new Board(2, "이순신", "생성자","생성자의 호출", 2000);
		b2.prn();
	}

}
