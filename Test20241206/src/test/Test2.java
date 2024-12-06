package test;

public class Test2 {

 public static void main(String[] args) {
	 
//		메서드 오버라이딩
//		다형성 : 메서드 이름은 동일한데 메서드 내에 동작내용 다름
		
//		패키지 test 파일 Shape 도형 부모 클래스
//		prn() "도형을 그린다"
		
//		Circle 원 자식 클래스 상속 Shape
//		메서드 오버라이딩 prn() "원을 그린다"
		
//		Tri 삼각형 자식 클래스 상속 Shape
//		메서드 오버라이딩 prn() "삼각형을 그린다"
		
//		Rec 사각형 자식 클래스 상속 Shape
//		메서드 오버라이딩 prn() "사각형을 그린다"
		
//		다형성
//		: 상위클래스 공통 부분의 메서드를 제공
//		: 하위클래스 추가요소를 더하면
//		: 코드 양도 줄어들고 유지보수도 편리
		
//		Circle 객체생성  prn() 메서드 호출
		Circle circle = new Circle();
		circle.prn();
		
//		Tri 객체생성  prn() 메서드 호출
		Tri tri = new Tri();
		tri.prn();
		
//		Rec 객체생성  prn() 메서드 호출
		Rec rec =  new Rec();
		rec.prn();
		
		//-----------------------------
		
//		기본자료형 형변환
//		자동으로 형변환 실수 = 정수
		double a = 3;
		System.out.println(a);//3.0
		
//		명시적으로 형변환  정수 = (정수형으로 명시적 형변환)실수
		int b = (int)3.5;
		System.out.println(b);//3
		
//		참조형의 형변환
//		자동으로 형변환  부모 = 자식 객체생성 (업캐스팅)
//		명시적으로 형변환 자식 = (자식형으로 명시적 형변환)부모(다운캐스팅)
		
		//업캐스팅을 이용한 다형성
		//Shape = Circle
		Shape shape = new Circle();
		shape.prn(); // 원을 그린다
		
		shape = new Tri();
		shape.prn(); // 삼각형을 그린다

		shape = new Rec();
		shape.prn(); // 사각형을 그린다
		
		System.out.println("------------------------------");
		
		School sch = new School();
		sch.draw(circle);
		// 부모 도형 변수 = 원(자동으로 형변환, 업캐스팅)
		sch.draw(tri);
		sch.draw(rec);
		
		//요게 업캐스팅
		//session.setAtrribute("id", "kim")
		//"id" -> String 고정
		//"kim" -> 모든참조형 Object / 모든 클래스의 부모 Object
 }
	
	
}
