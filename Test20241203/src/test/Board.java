package test;

public class Board {
	//멤버변수 private name, subject, content
	
	//Board 클래스 정의
	//static 멤버변수 int num
	//멤버변수 private name, subject, content
	//기본 생성자 num 1씩 증가
	//메서드 setter getter
	
	private static int num;
	private String name;
	private String subject;
	private String content;
	
	
	public Board () { num++; }
	
	public Board(int num, String name, String subject, String content) {
		Board.num=num;
		this.name=name;
		this.subject=subject;
		this.content=content;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Board.num = num;
	}
	public void prn() {
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("제목 : " + subject);
		System.out.println("내용 : " + content);
	}
}
