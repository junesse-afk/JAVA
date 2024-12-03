package test;

import java.util.ArrayList;

public class BoardDAO {

	//BoardDAO 클래스 정의
	//리턴할 형 없음 insertBoard
	
	public void insertBoard(Board board){ //Board 기억장소를 들고와야하기때문에 get/set 때문에
		System.out.println(Board.getNum()); // static 객체 생성하지 않고 사용할 수 있음 [클래명을 써야 노란줄 안뜸]
		System.out.println(board.getName()); // 객체를 생성하기 때문에 주소값으로 접근함
		System.out.println(board.getSubject());
		System.out.println(board.getContent());
	}
	
	public void insertBoard2(ArrayList<Board> arr) {
		for(int i = 0; i<arr.size(); i++) {
			arr.get(i).prn();
		}
		
		for(Board b : arr) {
			b.prn();
		}
	}
}
