package test;

public class Test3 {

	public static void main(String[] args) {
		int a;	// 변수 선언(지역변수)(기억장소 할당)
//		System.out.println(a); 에러발생
		// 초기값 할당 작업 없어 변수 사용할 수 없음
		
		//Car 클래스 정의
		//멤버변수 정의 String color, int cc
		
		//생성자는 생략 => 생성자가 없으면 기본생성자 컴파일할때 자동으로 만들어진다
		//=> Car 형태의 기억장소 생성, 멤버변수 초기값을 null, 0 할당
		//		메서드() 메모리 할당 사용할 준비
		
		//메서드 prn()출력 color : cc
		//메서드 안에 있는건 지역변수 / 로컬변수

		//car변수(지역변수, 참조변수)
//		Car 클래스 객체생성
		Car car1 = new Car();
		Car car2 = new Car("Black", 1500);
		Car car3 = new Car("Blue");
		Car car4 = new Car(800);
		
//		car 변수(지역변수, 참조변수)
		
		//prn() 메서드 호출
		car1.prn();		// White : 1000
		car2.prn();		// Black : 1500
		car3.prn();		// Blue : 0
		car4.prn();		// null : 800

		int c[] = new int[3];
		System.out.println(c[0]); //0
		System.out.println(c[1]); //0
		System.out.println(c[2]); //0
		
		int d[] = new int[] {10, 20, 30};
		System.out.println(d);
		System.out.println(d[0]); //10
		System.out.println(d[1]); //20
		System.out.println(d[2]); //30
	}

}
