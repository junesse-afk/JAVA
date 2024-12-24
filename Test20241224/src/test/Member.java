package test;

public class Member {
	
	private String id;
	private String pass;
	private String name;
	private int age;

	//생성자 패턴
	public Member(String id, String pass, String name, int age) {
		this.id=id;
		this.pass=pass;
		this.name=name;
		this.age=age;
	}

	// Builder를 받는 생성자
	public Member(Builder builder) {
		this.id=builder.id;
		this.pass=builder.pass;
		this.name=builder.name;
		this.age=builder.age;
	}
	
	//정적 메서드 패턴 리턴할형 Member of(id,pass,name) Member객체생성 리턴
	public static Member of(String id, String pass, String name) {
		return new Member(id, pass, name, 0);
	}
	
	//빌더 패턴 => 정적 내부 클래스 Builder
	public static class Builder{
		
		//매개변수(기본값 설정)
		private String id = "";
		private String pass = "";
		private String name = "";
		private int age = 0;
		
		//Builder 생성자 : 필수 매개변수를 초기화
		public Builder(String id) {
			this.id = id;
		}
		
		//Builder set메서드(리턴 Builder)
//		public Builder Id(String id) {
//			this.id = id;
//			return this;
//		}
		public Builder Pass(String pass) {
			this.pass = pass;
			return this;
		}
		public Builder Name(String name) {
			this.name = name;
			return this;
		}
		public Builder Age(int age) {
			this.age = age;
			return this;
		}
		public Member Build() {
			return new Member(this);
		}
		
		
		
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + "]";
	}	

}
