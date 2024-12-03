package test;

public class Member {

	private String id;
	private int passwd;
	private String name;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPasswd() {
		return passwd;
	}
	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void prn() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + passwd);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
