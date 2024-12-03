package test;

public class Person {

	private String name;
	private int age;
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
	
	
	//메서드 오버로딩 : 클래스내에서 메서드 이름 동일 같은 메서드로 인식
	//            : 메서드 매개변수 개수, 형이 틀리면
	//            : 메서드 이름이 같아도 다른 메서드라고 인식
	
	public void prn() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
	
	public String prn(String name) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + this.age);
		return name;
	}
	public void prn(int age) {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + age);
	}
	public void prn(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
