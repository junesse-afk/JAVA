package test;

public class Test1 {

	public static void main(String[] args) {
		// 객체지향개념 특징 : 데이터 은닉, 캡슐화
		// : 데이터를 저장하는 공간인 멤버변수의 접근을
		//	클래스 내에서 만 접근하고 외부에는 접근 못하게 설정

		// 외부에서 접근할 수 있는 메서드 준비해서 사용
		
		// 접근 범위 순 : public > protected > default > private
		
		// public : 모두 접근, 같은 클래스 내, 같은 폴더, 다른 폴더 접근
		// protected : 같은 클래스 내, 같은 폴더, 다른 폴더(상속관계) 접근
		// default(생략) : 같은 클래스 내, 같은 폴더 접근
		// private : 같은 클래스 내 접근
		
		// 멤버변수에 값을 저장
		// => 멤버변수에 값을 저장하기 위한 public 메서드()정의
		
		Student stu = new Student();
		
		//Stu.num=1;
		stu.setNum(1);
		//Stu.name="홍길동";
		stu.setName("홍길동");
		
		//Stu.java=80;
		stu.setJava(80);
		
		//Stu.db=94;
		stu.setDb(94);
		
		//Stu.jsp=75;
		stu.setJsp(75);
		
		//Stu.html=100;
		stu.setHtml(100);
		
		System.out.println(stu.sum());
		stu.intro();
	}

}
