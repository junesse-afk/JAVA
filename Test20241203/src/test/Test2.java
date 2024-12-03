package test;

public class Test2 {

	public static void main(String[] args) {
		// 배열 : 같은형의 여러개 기억장소를 정의 사용
		int a[] = new int[5];
		a[0] = 10; //0번째 열에 저장
		System.out.println(a); //@뒤에가 현재 힙 주소
		
		String b[] = new String[5];
		b[0] = "문자열";
		System.out.println(b); //@뒤에가 현재 힙 주소
		//-------------------------------------------------------------
		Board c[] = new Board[3]; //내가 만든 클래스도 쓸 수 있음
		//c[0] = new Board(); //한줄에 표현 가능
		
		Board c1 = new Board(); // set 메소드를 호출해야함
		c1.setName("이순신");
		c1.setSubject("제목2");
		c1.setContent("내용2");
		c[0] = c1;
		
		Board c2 = new Board();
		c2.setName("강감찬");
		c2.setSubject("제목3");
		c2.setContent("내용3");
		c[1] = c2;
		
		Board c3 = new Board();
		c3.setName("권율");
		c3.setSubject("제목4");
		c3.setContent("내용4");
		c[2] = c3;
		
		for (int i=0; i<c.length; i++) {
			System.out.println(Board.getNum());
			System.out.println(c[i].getName());
			System.out.println(c[i].getSubject());
			System.out.println(c[i].getContent());
		}
		
	}

}
