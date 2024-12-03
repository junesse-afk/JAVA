package test;

public class Member {
	private String id;
	private int pass;
	private String name;
	
	public Member() {}
	
	public Member(String id, int pass, String name) {
		this.id=id;
		this.pass=pass;
		this.name=name;
	
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void prn() {
		System.out.println("아이디" + getId());
		System.out.println("비밀번호" + getPass());
		System.out.println("이름" + getName());
		
	}
	
}
