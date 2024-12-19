package test;

public class Test4 {
	
	public static void main(String[] args) {
	//13장 내부클래스, 람다식, 스트림
	//15장 자바 입출력
	//스레드
	
	// 내부 클래스 : 클래스 안에 선언한 클래스
	//          : 클래스와 클래스 밀접한 관계
	//          : 인스턴스 내부 클래스, 정적 내부 클래스
	//          : 지역 내부 클래스, 익명 내부 클래스
		
		class ABC { //외부클래스
			
			int n1; //인스턴스 변수
			static int n2; //클래스 변수, 정적변수
	
			public void abc() {
				int i; //지역 변수
				
			}
		}
		
		class OUt { //외부클래스
			class in { // 인스턴스 내부 클래스
				static class Sin { // 정적 내부 클래스
				}
			}
			public void In() { //메서드
				class local { // 지역 내부 클래스
					
				}
				
			}
		}
		
		//8. 외부클래스 객체생성
		OutClass outClass = new OutClass();
		//멤버변수 private 정의 접근 못함
		//System.out.println(outClass.num);
		//System.out.println(outClass.sNum);
		outClass.usingClass();
		
		//내부클래스 객체생성
		//InClass inClass = new InClass();
		//System.out.println(inClass.inNum);
		//inClass.inTest();
		
	}
}
