package test;

public class Test7 {
		private String name = "홍길동";
		private int age = 18;

		public void Person(){
		}
		
		public void Person (String name, int age) {
				this.name=name;
				this.age=age;
		}

		public void prn(){
			System.out.println(name + age);
		}
	
	public static void main(String[] args) {
		
		
		/*1. 변수(자료형), 자료형의 형변환
		 * 
		 * 변수 선언 (변수명 만드는 규칙)
		 * 예) 정수형 int a = 10; 초기화 int a; 초기화 후 선언 a = 10;
		 *    실수형 double b = 3.4; short, byte, long
		 *    문자형 char c = 'A', String d = "문자열";
		 *    논리형 boolean e = 10;
		 *    
		 *    변수 이름은 영문자(대문자, 소문자)나 숫자를 사용할 수 있고
		 *              특수문자 중에는 $, _만 사용할 수 있다.
		 *              
		 *    변수 이름은 숫자로 시작할 수 없다.
		 *    변수 이름은 이미 사용중인 예약어는 사용할 수 없다.
		 */
		
		 /* 2. 연산자
		 *  
		 *  산술연산자
		 *  +. -, *, /, %  계산결과
		 * 
		 *  관계연산자
		 *  ==, !=, > >= <, <= true/false
		 *  
		 *  논리연산자
		 *  && || ! true/false
		 */
		
		 /* 3. 제어문(조건문, 반복문)
		 * 
		 * 조건문 if, switch
		 * 반복문 for, while
		 * 
		 * if 버스 탑승 요금 계산
		 * 8세보다 작으면(취학 전 아동) 1,000원
		 * 8세이상 ~ 14세 작으면 2,000원
		 * 14세이상 ~ 20세 작으면 2,500원
		 * 나머지는 3,000원
		 * 나이변수, 요금변수
		 */
		 
	     int i = 10;
		 int charge = 0;
			
				 if (i < 8) {
					 charge = 1000;
				 } else if (i>=8 && i<14) {
					 charge = 2000;
				 } else if (i>=14 && i<20) {
					 charge = 2500;
				 } else {
					 charge = 3000;
				 }
				 System.out.println(i + "세 요금은 " + charge +"원 입니다");
		
		/* 3-2. 배열
		 * 배열을 사용하려면 먼저 배열 선언하고
		 * 예시 int 변수명[] = new int[자리수];
		 * 
		 * int a[] = new int(5);
		 * a[0] = 10;
		 * a[1] = 20;
		 * a[2] = 30;
		 * a[3] = 40;
		 * a[4] = 50;
		 * 
		 * int 변수명[] = new int[] {10, 20, 30};
		 * 
		 * int b[] = new int[] {10, 20, 30, 40, 50};
		 * int c[] = {10, 20, 30, 40, 50};
		 * 
		 * 문자열 배열 선언
		 */
	
		 String str[] = new String[] {"홍길동", "강감찬", "이순신"};
		 System.out.println(str[0]);
		 System.out.println(str[1]);
		 System.out.println(str[2]);
		 
		 for (int c = 0; c <str.length; c++) {
			 System.out.println(str[c]);
		 }
		 /* 4. 객체(멤버변수, 멤버변수(메서드))
		 * 
		 */
		 
		 /* 5. 객체 지향 프로그래밍 개념 특징 (언어 종류)
		 * 캡슐화(은닉) private, 상속(상속성) extends, 다형성(부모의 메서드를 재정의해서[오버라이드]), 추상화
		 */
		 
		 /* 6. 클래스 정의, 멤버변수 정의, 생성자 정의
		 * 객체 생성, 메서드 호출
		 */

		 Test7 test7 = new Test7();
		 test7.prn();
		 
		 Person person = new Person();
		 person.name="이순신";
		 person.age=24;
		 person.prn();
		 
		 /* 7. 상속
		  * Student 클래스 정의 상속 Person
		  * 멤버변수 학번 num
		  * prn2() 메서드 출력 num : name
		  * 
		  */
		 
		 Student student = new Student();
		 student.num=1;
		 student.name="홍길동";
		 student.prn();
		 student.prn2();
		 
		 /* 8. 접근 제어자 public protected
		  * 			생략(default,package) private
		  */
		 
		 /* 9. 클래스(정적) 변수, 인스턴스 변수, 로컬변수
		  *                      선언            사용          영역 
		  * 지역변수(로컬변수) = 함수 내부에 선언 | 함수내부에서만 사용 | 스택 | 함수가 호출될 때 생성되고 함수가 끝나면 소멸
		  * 
		  * 멤버변수(인스턴스변수) = 클래스 멤버변수로 선언 | 클래스 내부에서 사용하고 pricate이 아니면 참조 변수로 다른 클래스에 사용 가능 | 힙 | 인스턴스가 생성될때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 떄 소멸됨
		  * 
		  * static변수(클래스변수) = static 예약어를 사용하여 클래스 내부에 선언 | 클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에 사용 가능  | 데이터영역 | 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리 해제할떄 소멸됨
		  */
		 
		 /* 10. 가비지 컬렉터(Garbage Collector)
		  * 메모리 관리를 담당하는 시스템 또는 프로그램의 구성 요소이며, 메모리에서 더 이상 사용되지 않는 객체를 찾아 제거하여 메모리를 회수하는 역할을 수행한다.
		  */
		 
		 /* 11. final 개념
		  * 
		  * 사용위치
		  * 변수 / final 변수는 상수를 의미
		  * 메서드 / final 메서드는 하위 클래스에서 재정의할 수 없습니다.
		  * 클래스 / final 클래스는 상속할 수 없습니다.
		  * 
		  */
		 
		 /* 12. 형변환, instanceof 연산자
		  * 
		  * instanceof : 왼쪽에 있는 변수의 원래 인스턴스형이 오른쪽 클래스 자료형인가 확인
		  * 
		  * Person person instanceof student
		  */
		 
		 //업 캐스팅
		 Person person2 = new Student();
		 person2.prn();
		 
		 //다운 캐스팅
		 Student student2 = (Student) person2;
		 student2.prn();
		 student2.prn2();
		 
		 /*13. 추상클래스, 인터페이스 => 이해
		 */
		 
		 //서술형 15문제, 실습형 3문제
	}
}