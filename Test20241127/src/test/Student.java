package test;

public class Student {
	//멤버변수 : 데이터 은닉 > 외부에서 접근 못하게 막음
	private int num;
	private String name;
	private int java;
	private int db;
	private int jsp;
	private int html;
	
	//멤버변수에 값을 저장하기 위한 public 메서드() 정의
	//외부의 값을 내부에 있는 멤버변수에 값을 저장하기 위한
	//public 메서드()정의 => setter 메서드
	public void setNum(int num) {
		this.num=num;
	}
	
	//외부에서 내부의 멤버변수 값을 가져오기 위한
	//public 메서드() 정의
	public int getNum() {
		return num;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setJava(int java) {
		this.java=java;
	}
	
	public int getJava() {
		return java;
	}
	
	public void setDb(int db) {
		this.db=db;
	}
	
	public int getDb() {
		return db;
	}
	
	public void setJsp(int jsp) {
		this.jsp=jsp;
	}
	
	public int getJsp() {
		return jsp;
	}
	
	public void setHtml(int html) {
		this.html=html;
	}
	
	public int getHtml() {
		return html;
	}
	
	
	
	public int sum() {
		return java + db + jsp + html;
	}
	  
	  
	public void intro() { 
		System.out.println("번호 : " + num + ", 이름 : " + name);
	}
	 
}
