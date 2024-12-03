package test;

public class Test3 {

	public static void main(String[] args) {
		// Book 클래스 정의
		// 멤버변수 private String bookName, author
		
		// 기본생성자
		// 모든 값을 받는 생성자
		// set, get 메서드 정의
		
		// prn()메서드 책이름, 저자 출력
		// book 3개의 배열에 저장
		
		// 배열 출력
//      다오 해서 끌어와서 출력		
//		Book c[] = new Book[3];
//		Book book1 = new Book();
//		book1.setBookname("책1");
//		book1.setAuthor("저자1");
//		c[0]=book1;
//		
//		Book book2 = new Book();
//		book2.setBookname("책2");
//		book2.setAuthor("저자2");
//		c[1]=book2;
//		
//		Book book3 = new Book();
//		book3.setBookname("책3");
//		book3.setAuthor("저자3");
//		c[2]=book3;
//		for(int i=0; i<c.length; i++) {
//			System.out.println(c[i].getBookname());
//			System.out.println(c[i].getAuthor());	
//		}
//		
//		
		Book book1 = new Book("토지", "박경리");
		Book book2 = new Book("어린왕자", "생택쥐페리");
		Book book3 = new Book("태백산맥", "조정래");
		
		Book bookArr[] = new Book[3];
		bookArr[0]=book1;
		bookArr[1]=book2;
		bookArr[2]=book3;
		
		for(int i = 0; i<bookArr.length; i++) {
			System.out.println(bookArr[i]);
			bookArr[i].prn();
			
		}System.out.println("--------------------");
		for(Book b: bookArr) {
			System.out.println(b);
			b.prn();
		}
		

			
	}

	

}
