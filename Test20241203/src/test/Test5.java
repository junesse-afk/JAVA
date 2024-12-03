package test;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		// Board 모든 값을 받는 생성자 추가
		// Board 객체 생성 게시판글 3개 준비
		
		// Board형을 담음 ArrayList배열 객체 생성
		// 게시판글 3개 배열에 저장
		
		// for 출력 

		ArrayList<Board> arr = new ArrayList<Board>();
		Board b1 = new Board(1, "홍길동", "제목1", "내용1");
		Board b2 = new Board(2,"어린왕자", "제목2", "내용2");
		Board b3 = new Board(3, "조정래", "태백산맥", "내용3");
		
		arr.add(b1);
		arr.add(b2);
		arr.add(b3);
		
		for (int i=0; i<arr.size(); i++) {
			arr.get(i).prn();
		}
		System.out.println("--------------------------");
		for (Board board : arr) {
			board.prn();
			
		}
		System.out.println("--------------------------");
		//BoardDAO 객체생성
		//리턴할형은 없음 insertBoard2(Board를 저장한 ArrayList 배열 변수)
		//for 출력 메서드 정의
		//insertboard2() 메서드 호출
		
		BoardDAO dao = new BoardDAO();
		dao.insertBoard2(arr);
		
	}
	

}
