package test;

public class Test1 {

	public static void main(String[] args) {

		//(Board 기억장소 주소 전달 받은 값을 저장하는 변수
		//전달받은 값은 글번호: 이름: 제목: 내용: 출력
		
		Board board = new Board();
		board.setName("홍길동");
		board.setSubject("제목2");
		board.setContent("내용");
		
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(board); //Board 기억장소를 들고와야하기때문에 셋 문제
	}

}
