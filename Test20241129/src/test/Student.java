package test;

public class Student {
	//접근제어자 static 자료형 변수명;
	private static int num;
	public int id;
	public String name;
	public int grade;
	public String address;
//	
	public Student() {
		num++;
		grade++;
	}
//	
//	public int getNum() {
//		return num;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getGrade() {
//		return grade;
//	}
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	
	public void prn() {
		System.out.println("num = " + num);
		System.out.println("name = " + name);
		System.out.println("id = " + id);
		System.out.println("grade = " + grade);
	}
	//static 메서드(클래스 메서드) => static 변수만 사용가능
	//접근제어자 static 리턴할형 메서드명(){}
	public static void prn2( ) {
		System.out.println("num = " + num);
//		System.out.println("name = " + name);
//		System.out.println("id = " + id);
//		System.out.println("grade = " + grade);
	}
}
