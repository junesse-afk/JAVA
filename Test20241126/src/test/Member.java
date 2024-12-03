package test;

public class Member {
	// Member 클래스 정의
	// 멤버변수 id, pass, name, int age
	
	public String id;
	public int pass;
	public String name;
	public int age;
	
	
	// 생성자 => 기억장소 할당, 초기값 할당
	// 기본 생성자 => 0, null 기본 초기값 할당
	public Member() {
		// id, pass, name, age 값을 받아서 멤버변수에 초기값 할당
		
		//자기 자신의 생성자를 호출
		//this("kim");
		//this(10);
		
		this("kim", 1111, "김", 55);
		System.out.println("기본생성자");
		
	}// 생성자 오버로드(생성자 이름은 동일하고, 받는 변수 다름)
	//받는 변수 다름 => 형이 틀림, 개수 틀림, 개수 같을때 형이 틀림
	
	public Member(int age) {
		this.age=age;
	}
		
		
	
	
	public Member(String id, int pass, String name, int age) {
		// id, pass, name, age 값을 받아서 멤버변수에 초기값 할당
		this.id=id;
		this.pass=pass;
		this.name=name;
		this.age=age;
		
		
	}	
	// 메서드() prn() 출력 아이디 : , 비밀번호 : , 이름 : , 나이 : , 출력
	public void prn() {
		System.out.println("아이디 : " + id + ", 비밀번호 : " + pass + ", 이름 : " + name + ", 나이 : " + age);
	}

}
