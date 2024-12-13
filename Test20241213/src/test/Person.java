package test;

public class Person {

	//클래스 person
	//이름, 나이, 성별, 결혼여부, 자녀수
	//메서드() : prn() 출력 나이 : , 이름: , 성별 : , 결혼여부 : , 자녀수 : ,
	
	public String name;
	public int age;
	public String gender;
	public String wedding;
	public int child;
	
	public Person(int i, String string, String string2, boolean b, int j) {
		// TODO Auto-generated constructor stub
	}

	public void prn() {
		System.out.println("이 사람의 나이 : " + age);
		System.out.println("이 사람의 이름 : " + name);
		System.out.println("이 사람의 성별 : " + gender);
		System.out.println("이 사람의 자녀 수 : " + child);
		
		if(child > 0) {
			wedding = "결혼 함";	
		} else {
			wedding = "결혼 안함";
		} System.out.println("이 사람의 결혼 여부 : " + wedding);
		
	}
	
	
}
