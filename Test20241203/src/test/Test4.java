package test;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		// String 클래스 => 문자열 주제 => 자바 내장객체
		// ArrayList 클래스 => 배열 주제 => 자바 내장객체
		// 배열의 단점을 보완해서 만들 클래스 ArrayList
		// 처음 기억장소 10개 정의 => 10개 넘는 데이터 추가
		// 자동으로 10개씩 기억장소 추가
		
		// ArrayList 배열 객체생성
		// 참조주소, 멤버변수, 참조주소.메서드()호출
		
		// ArrayList 배열크기 - 참조주소.size() -
		
		// ArrayList 배열 데이터 추가 - 참조주소.add() -
		// 순서대로 데이터 입력, 0 1 2 순으로 데이터 입력
		
		// ArrayList 배열 데이터 가져오기 - 참조주소.get(순서) -
		
		// String : 기본 폴더 java.lang => 자동으로 찾는 폴더
		String s = "문자열";
		System.out.println(s);
		
		Book book1 = new Book("토지", "박경리");
		Book book2 = new Book("어린왕자", "생택쥐페리");
		Book book3 = new Book("태백산맥", "조정래");
		
		// ArrayList : 다른 폴더 java.util.ArrayList; => 폴더 위치 명시
		ArrayList<Book> arr = new ArrayList<Book>();
		// <> Book 클래스를 가져오는가봄
		arr.add(book1); //배열 0번째 저장
		arr.add(book2); //배열 1번째 저장
		arr.add(book3); //배열 2번째 저장
		
		System.out.println("배열크기 : " + arr.size());
		
		System.out.println(arr.get(0).getBookname()); //배열 안에 가져오기
		System.out.println(arr.get(1).getBookname());
		System.out.println(arr.get(2).getBookname());

		arr.get(0).prn();
		arr.get(1).prn();
		arr.get(2).prn();
		System.out.println("------------------------------------");
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).getBookname());
			System.out.println(arr.get(i).getAuthor());
			arr.get(i).prn();
		}
		System.out.println("------------------------------------");
		
		for(Book book : arr) {
			System.out.println(book.getBookname());
			System.out.println(book.getAuthor());
			book.prn();
		}
		System.out.println("------------------------------------");
	}

}
