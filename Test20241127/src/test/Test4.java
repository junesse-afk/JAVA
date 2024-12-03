package test;

public class Test4 {

	public static void main(String[] args) {
		// Person 클래스 정의
		// 멤버변수 name, age 정의 -> 데이터 은닉 -> setter, getter
		// 메서드 정의 prn() name, age 출력

		Person ps = new Person();
		ps.setName("이순신");
		ps.setAge(17);
		ps.prn();
		ps.prn(22);
		ps.prn("강감찬");
		ps.prn("가나다", 99);
	}

}
